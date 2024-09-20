package Strings;

public class StringPractice3 {
    public static void main(String[] args) {

        String str1="Pyramid";
        String str2="pyramid";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);
// here == operator compares the references which holds the objects not the string.

        System.out.println("");
        //String str1="pyramid";

        String str3="china wall";
        String str4=new String("china wall");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));
//if str3 is smaller than str4 then value will be negative and vice versa
        //the value shown is the diffrence in ascii values.

        System.out.println("");

        String s1="the great wall ";
        String s2="of china";
        System.out.println(s1.contains("wall"));
        System.out.println(s1.concat(s2));//System.out.println(str1 + str2);
        System.out.println(s1);
    }
}
