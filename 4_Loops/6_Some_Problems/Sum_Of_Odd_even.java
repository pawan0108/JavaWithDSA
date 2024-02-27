// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
//               even and odd integers.

import java.util.*;

public class Sum_Of_Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumOfOdd = 0;
        int SumOfEven = 0;
        int choice;
        int num;
        do {
            System.out.print("Enter a Number : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                SumOfEven += num;
            } else {
                SumOfOdd += num;
            }

            System.out.println("Do You Wnat Continue then Press one Or no press 0.");
             choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum Of Even Numbers : "+SumOfEven);
        System.out.println("Sum Of Odd Numbers : "+SumOfOdd);
    }
}
