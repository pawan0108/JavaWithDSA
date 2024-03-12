// Cobertion Decimal To Binary

public class Decimal_to_Binary {
    public static void DecToBin(int DecNum){
        int Decimal = DecNum;
         int bin = 0;
         for(int pow = 0; DecNum>0; pow++){
            int rem = DecNum%2;
            bin = bin + ( rem *(int) Math.pow(10, pow));
            DecNum = DecNum/2;
         }
           System.out.println("Binary of "+Decimal+" = "+ bin);
    }
    public static void main(String[] args) {
        DecToBin(999);
    }
}
