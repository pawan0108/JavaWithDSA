// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

import java.util.*;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
