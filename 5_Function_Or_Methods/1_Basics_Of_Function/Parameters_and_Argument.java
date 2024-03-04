import java.util.Scanner;

public class Parameters_and_Argument {
    public static int parameter(int a, int b){ // Parameters or Formal parameteres
        int sum = a +b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = parameter(9, 8); // Arugments or Actual Parameters
        System.out.println("Sum is : "+sum );
    }
}
