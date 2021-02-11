///package javaapplication1;
import java.util.Scanner;

public class Grade {
    public static String name;
    public static Double grade;
    public static Scanner sc;

    public static void main(String[] args) {
        
       
        sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your grade:");
        grade = sc.nextDouble();

        if (grade >= 0 && grade <= 100) {
            System.out.println("Your letter grade is " + Grade.result());
        } else {
            System.out.println("enetered grade is invalid.");
        }

    }

    public static String result() {
        if (grade >= 80 && grade <= 100) {
            return "A";
        } else if (grade >= 70 && grade < 80) {
            return "B";
        } else if (grade >= 60 && grade < 70) {
            return "C";
        } else if (grade >= 50 && grade < 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
