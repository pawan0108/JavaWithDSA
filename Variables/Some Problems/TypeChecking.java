// Question 4: What will be the type of result in the following Java code?
// byte b = 4;
// char c = 'a';
// short s = 512;
// int i = 1000;
// float f = 3.12f;
// double d = 99.98735;
// result = (f * b) + (i % c) - (d * s);

public class TypeChecking {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.12f;
        double d = 99.98735;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
