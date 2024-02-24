// Question 4 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.

import java.util.*;

public class Leap_year_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("It is Leap Year");
        } else if(year % 4==0 && year % 100 != 0) {
            System.out.println("It is Leap year");
        }
        else{
            System.out.println("It is Not Leap year");
        }
    }
}
