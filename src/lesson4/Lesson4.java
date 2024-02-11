package lesson4;
/**
 * @AIT-TR Cohort42.1 lesson4
 * @author Valerian
 * @version 2022-01-22
 */


import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Result:");
        System.out.println(a + " + " + b + " = " + (a + b));

    // class String
    String str = new String("Hello, Java");
    // man kann auch String str = "Hello Java"; schreiben
    String[] parts = str.split(" ");
//        System.out.println(str.substring(7));  ???
}
}

