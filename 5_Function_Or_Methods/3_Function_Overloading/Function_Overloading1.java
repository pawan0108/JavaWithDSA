// Function Overloading using Parameters

public class Function_Overloading1 {
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("This is 3 Variable Sum : "+sum(7, 5, 6));
        System.out.println("This is 2 Variable Sum : "+sum(7, 5));
    }
}
