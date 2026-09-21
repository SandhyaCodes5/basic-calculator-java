package mypackage;
import java.util.*;

public class Main {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your marks");
         int marks = sc.nextInt();
         if(marks>90) {
        	 System.out.println("Congratulations.....You got Grade A");
         }
         else if(marks > 80 && marks <= 90) {
             System.out.println("Good......You got Grade B");
         }
         else if(marks > 60 && marks <=80) {
        	 System.out.println("You got Grade C and could do better");
         }
         else {
        	 System.out.println("You failed the exam");
         }
	}
}
