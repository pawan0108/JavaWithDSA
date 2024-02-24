import java.util.*;

public class Largest_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.println(A + " = A is Larger Number");
        } else {
            System.out.println(B + " = B is Larger Number");
        }
    }

}
