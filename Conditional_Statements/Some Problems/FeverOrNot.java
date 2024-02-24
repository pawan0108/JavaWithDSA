// Question 2 : Prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class FeverOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Temperature : ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}
