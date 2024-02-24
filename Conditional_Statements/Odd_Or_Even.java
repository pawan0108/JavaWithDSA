import java.util.*;

public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int A = sc.nextInt();
        if (A % 2 == 0) {
            System.out.println(A + " = is Even Number");
        } else {
            System.out.println(A + " = is Odd Number");
        }
    }
}
