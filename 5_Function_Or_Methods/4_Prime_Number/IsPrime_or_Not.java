
public class IsPrime_or_Not {
    public static boolean Isprime(int n){
    //    boolean isprime = true;
    //    for(int i=2; i<=n-1; i++){
    //     if (n%i==0){
    //         isprime = false;
    //     }
    //    }
    //    return isprime;

    // boolean isprime = true;
    // for(int i=2; i<=n-1; i++){
    //  if (n%i==0){
    //      isprime = false;
    //      return isprime;
    //  }
    // }


    // return isprime;
    // only for n>=2
    // corner cases
     // 2
    
     if(n==2){
        return true;
     }

    for(int i=2; i<=n-1; i++){
     if (n%i==0){
         return false;
     }
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(Isprime(6));
    }
}
