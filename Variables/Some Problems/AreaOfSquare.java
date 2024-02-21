// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

import java.util.*;

public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int Area = side * side;
        System.out.println("Area of Square : " + Area);
    }
}
