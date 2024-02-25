// Keep Entering Numbers till user enters a Multiple of 10 then break

import java.util.Scanner;

public class if_Multiple_Of_10_Then_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    // do{
    //     System.out.print("Enter your Number : ");
    //     int num = sc.nextInt();
    //     if (num%10 == 0) {
    //         break;
    //     }
    //     System.out.println(num);
    // }while(true);

    // Using For Loop

    // for( ; true; ){
    //     System.out.print("Enter your Number : ");
    //     int num = sc.nextInt();
    //     if (num%10 == 0) {
    //         break;
    //     }
    //     System.out.println(num);
    // }

    //Using while Loop

while (true) {
    System.out.print("Enter your Number : ");
    int num = sc.nextInt();
    if (num%10 == 0) {
        break;
    }
    System.out.println(num);
}

    System.out.println("SORRRY!, LOOP END");
    }
}
