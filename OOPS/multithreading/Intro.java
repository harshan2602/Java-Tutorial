package OOPS.multithreading;

class Books{
    void updateDB(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating DB");
        }
    }
}
class Numbs{
    void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
public class Intro {
    public static void main(String[] args) {
        Books b = new Books();
        Numbs n = new Numbs();

        b.updateDB();
        n.print();
    }
}

