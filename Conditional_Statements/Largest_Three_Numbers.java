import java.util.*;

public class Largest_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A >= B && A >= C) {
            System.out.println(A + " = A is Larger Number");
        } else if (B >= C) {
            System.out.println(B + " = B is Larger Number");
        } else {
            System.out.println(C + " = C is Larger Number");
        }
    }
}
