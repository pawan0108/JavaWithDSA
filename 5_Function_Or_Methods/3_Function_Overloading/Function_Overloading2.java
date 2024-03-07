// Function Overloading using DataType

public class Function_Overloading2 {
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("This is Sum of Integer values : "+sum(6, 8));
        System.out.println("This is Sum of Floating values : "+sum(6.5f, 8.8f));
    }
}
