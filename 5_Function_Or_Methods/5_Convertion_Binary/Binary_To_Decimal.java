// Convertion Binary to Decimal

public class Binary_To_Decimal {
    public static void BinToDec(int BinNum){
        int Binary = BinNum;
        int dec = 0;
       for(int pow = 0; BinNum>0; pow++){
           int lastdig = BinNum%10;
           dec = dec +( lastdig *(int) Math.pow(2, pow));
           BinNum = BinNum/10;
       }
        System.out.println("Decimal of "+Binary+" = "+dec);
    }
    public static void main(String args[]){
        BinToDec(111);
    }
}
