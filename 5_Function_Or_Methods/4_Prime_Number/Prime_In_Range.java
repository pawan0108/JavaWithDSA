public class Prime_In_Range {
    public static boolean prime(int n){
        if(n==2){
            // System.out.print("This Number is Prime : ");
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            
            if(n%i==0){
                // System.out.print("This Number is not Prime : ");
                return false;
            }
        }
        // System.out.print("This Number is Prime : ");
        return true;
    }

    public static void PrimeInRange(int n){
        for(int i=2; i<=n; i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange(20);
    }
    
}
