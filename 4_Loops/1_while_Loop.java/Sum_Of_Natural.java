import java.util.*;
public class Sum_Of_Natural {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a natural Number ; ");
    int num = sc.nextInt();
    int counter = 1;
    int sum = 0;
    while(counter <= num){
       sum = sum + counter;
       counter++;
    }
    System.out.println("Sum of Natural Number : "+sum);
}
}
