// Question 4 : Write a program to print the multiplication table of a number N, entered by the
// user.

import java.util.*;
public class Print_Table_any_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("Table of : "+num);
        for(int i = 1; i<=10; i++){
            
            System.out.println(num+ " * "+i+" = "+num*i);
        }
    }
}
