import java.util.*;

public class Print_Prime_Or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println("Your Number is Prime!");
        } else {
            boolean isPrime = true;
            // for(int div = 2; div <= num - 1; div++)
            for (int div = 2; div <= Math.sqrt(num); div++) // Math.sqrt(num) use for optimization For Time Complexity
            {
                if (num % div == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("Your Number is Prime!");
            } else {
                System.out.println("your Numbers is Not Prime");
            }

        }
    }
}
