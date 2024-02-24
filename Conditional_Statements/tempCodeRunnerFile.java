import java.util.*;

public class Else_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int age = sc.nextInt();
        if(age>=40){
            System.out.println("you are Senior");
        }
        else if(age>=18 && age<=40) {
            System.out.println("You are Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("You are Teen Ager");
        }
        else{
            System.out.println("You are child");
        }
    }
}

