import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        System.out.print("Enter a Number Radius: ");
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        double pi = 3.14;
        double A = pi * r * r;

        System.out.print("Area of Circle " + r + " = " + A);

    }
}
