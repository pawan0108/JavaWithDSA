import java.util.Scanner;

public class product_of_a_and_b {
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();

        int prod = product(a, b);
        System.out.println("Product of a and b : "+prod);
    }
}
