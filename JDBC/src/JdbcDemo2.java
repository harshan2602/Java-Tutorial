import java.sql.*;
import java.util.Scanner;

public class JdbcDemo2 {
    public static void main(String[] args) {
        try {
            //	Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Company?characterEncoding=utf8";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            ResultSet rs;
            PreparedStatement st;
            String qry = "";
            int id, salary, choice;
            String name, designation;

            Scanner in = new Scanner(System.in);
            Scanner str = new Scanner(System.in);

            while (true) {
                System.out.println("MySQL Java CRUD Operation");
                System.out.println("1. INSERT  ");
                System.out.println("2. DELETE ");
                System.out.println("3. SELECT ");
                System.out.println("4. UPDATE ");
                System.out.println("5. EXIT ");
                System.out.print("Enter Your choice: ");
                choice = in.nextInt();
                System.out.println(" ****************************** ");
                switch (choice) {
                    case 1:
                        System.out.println("1. Insert New Data");

                        System.out.println("Enter eName : ");
                        name = str.nextLine();
                        System.out.println("Enter DESIGNATION : ");
                        designation = str.nextLine();
                        System.out.println("Enter SALARY : ");
                        salary = in.nextInt();
                        qry = "insert into Employee (eNAME,DESIGNATION,SALARY) values(?,?,?)";
                        st = con.prepareStatement(qry);
                        st.setString(1, name);
                        st.setString(2, designation);
                        st.setInt(3, salary);
                        st.executeUpdate();
                        System.out.println("Data Insert Success");
                        break;


                    case 2:
                        System.out.println("2. Deleting a Data");
                        System.out.println("Enter ID : ");
                        id = in.nextInt();

                        qry = "delete from Employee where ID=?";
                        st = con.prepareStatement(qry);
                        st.setInt(1, id);
                        st.executeUpdate();
                        System.out.println("Data Deleted Success");
                        break;


                    case 3:
                        System.out.println("3. Print all Records");
                        qry = "SELECT ID,eNAME,DESIGNATION,SALARY from Employee";
                        rs = stmt.executeQuery(qry);
                        while (rs.next()) {
                            id = rs.getInt("ID");
                            name = rs.getString("eNAME");
                            designation = rs.getString("DESIGNATION");
                            salary = rs.getInt("SALARY");

                            System.out.print(id + "   ");
                            System.out.print(name + "   ");
                            System.out.print(designation + "   ");
                            System.out.println(salary + "   ");

                        }
                        break;

                    case 4:
                        System.out.println("4. Updating a Data");
                        System.out.println("Enter ID : ");
                        id = in.nextInt();
                        System.out.println("Enter Name : ");
                        name = str.nextLine();
                        System.out.println("Enter DESIGNATION : ");
                        designation = str.nextLine();
                        System.out.println("Enter SALARY : ");
                        salary = in.nextInt();
                        qry = "update Employee set eNAME=?,DESIGNATION=?,SALARY=? where ID=?";
                        st = con.prepareStatement(qry);

                        st.setString(1, name);
                        st.setString(2, designation);
                        st.setInt(3, salary);
                        st.setInt(4, id);
                        st.executeUpdate();
                        System.out.println("Data Update Success");
                        break;

                    case 5:
                        System.out.println("Thank You");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        break;
                }

                System.out.println(" ******************************* ");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
