package Conditional_Statements;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // CHECK PERSON YOUNG OR NOT

            int age;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter your Age ");
            age=sc.nextInt();

            if(age>=14 && age<=55)
            {
                System.out.println("You are Young");
            }
            else
            {
                System.out.println("you are Not Young");
            }


        }
    }

