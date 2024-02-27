// Question 5:What is wrong in the following program?
// public class Solution {
//     public static void main(String args[]) {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("i = " + i);
//         }
//         System.out.println("i after the loop = " + i);
//     }

import java.util.*;
public class Check_What_is_wrong {
   public static void main(String[] args) {
            for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

         // Variable define in a Loop and Call Variable out of loop 
         // in java this is not Posible this is gives syntax Error
        
         // System.out.println("i after the loop = " + i); 
   } 
}
