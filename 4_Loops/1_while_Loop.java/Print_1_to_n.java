import java.util.*;
public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int counter = 1;
        while(counter <= num){
            System.out.println(counter);
            counter++;
        }
    }
}
