package mypackage;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Enter your choice");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.println("Addition of a and b: " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction of a and b: " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication of a and b: " + (a * b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Select another value of b");
                } else {
                    System.out.println("Division of a and b: " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}