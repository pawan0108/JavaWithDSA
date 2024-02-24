import java.util.*;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary in Lakhs : ");
        float salary = sc.nextFloat();

        if (salary < 5) {
            System.out.println("You no need to pay Any Tax!");
        } else if (salary >= 5 && salary < 10) {
            float tax = salary * 0.2f;
            System.out.println("According to Your Salary, You Pay Tax = " + tax + " Lakh");
        } else {
            float tax = salary * 0.3f;
            System.out.println("According to Your Salary, You Pay Tax = " + tax + " Lakh");
        }
    }
}