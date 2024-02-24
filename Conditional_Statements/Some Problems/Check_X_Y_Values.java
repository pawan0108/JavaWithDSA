//     Question 3 : What will be the value of x & y in the following program:
//     public class Solution {
//     public static void main(String args[]) {
//     int a = 63, b = 36;
//     boolean x = (a < b ) ? true : false;
//     int y= (a > b ) ? a : b;
//     }
//     } 

public class Check_X_Y_Values {
   public static void main(String args[]) {
      int a = 63, b = 36;
      boolean x = (a < b) ? true : false;
      int y = (a > b) ? a : b;
      System.out.println("Value of X : " + x);
      System.out.println("Value of Y : " + y);
   }
}
