import java.util.*;
public class Binomial_Coefficient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int bincoffi(int n, int r){
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_n_r = factorial(n-r);
       int binomicoeffi = fact_n/(fact_r*fact_n_r);
       return binomicoeffi;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number : ");
        int n = sc.nextInt();
        System.out.print("enter a Number : ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficent : "+bincoffi(n,r));
    }
}
