package Strings;

public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Java Program";

        System.out.println(str1);

        String str2 = new String("JAVA");
        System.out.println(str2);

        char c[] = {'H', 'e', 'l', 'l', 'o'};
        //String str3=new String(c);
        String str3 = new String(c,1,3);

        System.out.println(str3);

        byte b[] = {65, 66, 67, 68};
        //String str4=new String(b);
        String str4 = new String(b, 1, 2);
        System.out.println(str4);
/* Computers use the ASCII (American Standard Code for Information Interchange)
 table to map numeric values to characters.
 Byte Array Values: {65, 66, 67, 68} map to {A, B, C, D}.
String Constructor: new String(b, 1, 2)
takes bytes from index 1 (66, 'B') to index 2 (67, 'C').
starting index & no of char u want
 */

        String s1 = "Java";
//        String s2 = "Java";
         /* here java doesn't create a new instance it will make str2
        to point at the same object in pool */

        String s2 = new String("Java");
        //here a new object is created in heap since new keyword is used.
        System.out.println(s1 == s2);
    }
}
