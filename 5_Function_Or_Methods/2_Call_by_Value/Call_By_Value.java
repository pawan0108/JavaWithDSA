

public class Call_By_Value {
    public static void swap(int a, int b){
        int temp = a;
        a = ++b;
        b = ++temp;
        System.out.println("Value of a = "+a+" Value of b = "+b);
    }
    public static void main(String[] args) {
        int a= 10;
        int b = 5;
        
        swap(a, b);
        System.out.println("Value of a = "+a+" Value of b = "+b);
        
    }
}
