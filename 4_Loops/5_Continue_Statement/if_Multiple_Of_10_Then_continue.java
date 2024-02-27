import java.util.*;

public class if_Multiple_Of_10_Then_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Using For Loop

    // for(; true; ){
    //     System.out.print("Enter your Number : ");
    //     int num = sc.nextInt();
    //     if(num % 10 == 0){
    //         continue;
    //     }
    //     System.out.println(num);
    // }

   // Using Do While Loop

//    do{
//     System.out.print("Enter your Number : ");
//     int num = sc.nextInt();
//     if(num % 10 == 0){
//         continue;
//     }
//     System.out.println(num);

//    }while(true);

// Using While Loop

while (true) {
    System.out.print("Enter your Number : ");
    int num = sc.nextInt();
    if(num % 10 == 0){
        continue;
}
System.out.println(num);
}
    }
}
