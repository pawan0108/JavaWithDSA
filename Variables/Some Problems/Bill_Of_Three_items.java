// Question 3 - Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.(with 18% GST)

import java.util.*;

public class Bill_Of_Three_items {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Pencil Price : ");
      float pencil = sc.nextFloat();
      System.out.print("Enter Pen Price : ");
      float pen = sc.nextFloat();
      System.out.print("Enter Eraser Price : ");
      float eraser = sc.nextFloat();
      float total = pencil + pen + eraser;
      // float gst = 18*total/100;
      float gst = (18.0f / 100) * total;
      float CostWithGST = total + gst;
      System.out.println("Pencil Price is : " + pencil);
      System.out.println("Pen Price is : " + pen);
      System.out.println("Eraser  Price is : " + eraser);
      System.out.println("GST 18% is : " + gst);
      System.out.println("Bill of Total items with 18% GST : " + CostWithGST);
   }
}
