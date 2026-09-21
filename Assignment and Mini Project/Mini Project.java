package myPackage;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int balance = 5000;
        int amount;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("===== Bank Management Console =====");
            System.out.println("Deposit");
            System.out.println("Withdraw");
            System.out.println("Check Balance");
            System.out.println("Exit");
            System.out.println("Enter your choice");

            String ch = sc.next();

            switch (ch) {

                case "Deposit":

                    System.out.println("Enter amount to deposit");

                    amount = sc.nextInt();

                    if (amount > 0) {

                        balance = balance + amount;

                        System.out.println("Your new balance is: " + balance);

                    } else {

                        System.out.println("Amount must be positive");

                    }

                    break;

                case "Withdraw":

                    System.out.println("Enter amount to withdraw");

                    amount = sc.nextInt();

                    if (balance >= amount && amount > 0) {

                        balance -= amount;

                        System.out.println("Your new balance is: " + balance);

                    } else {

                        System.out.println("Select proper amount");

                    }

                    break;

                case "Check_Balance":

                    System.out.println("Your current balance is: " + balance);

                    break;

                case "Exit":

                    System.out.println("Thank you for using the Bank Management System!");

                    return;

                default:

                    System.out.println("Invalid choice");

                    break;
            }
        }
    }
}