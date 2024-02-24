import java.util.Scanner;

public class Ternary_Operator {
  public static void main(String[] args) {

    // Question - 1 : A True or B

    // int A = 9;
    // int B = 6;
    // String check = (A>B) ? "THis condition Is True" : "This Contion Is Flase";
    // System.out.println(check);

    // Question - 2 : Check odd Or Even

    // int A = 11;
    // String check = (A%2 == 0) ? "A is Even Number" : "A is Odd Number";
    // System.out.println(check);

    // Question - 3 : Check if a Student Pass Or Fail

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Ypur Marks : ");
    int marks = sc.nextInt();
    String Marks = (marks >= 33) ? "You are Pass" : "You are Fail";
    System.out.println(Marks);
  }
}
