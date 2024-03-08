// Check number is Prime or not!

import java.util.*;

public class Check_Prime_Number {
    public static boolean prime(int n) {
        if (n == 2) {
            System.out.print("This number is prime : ");
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print("This is Prime not prime Number : ");
                return false;
            }
        }
    System.out.print("This number is prime : ");
    return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(6));
    }

}
