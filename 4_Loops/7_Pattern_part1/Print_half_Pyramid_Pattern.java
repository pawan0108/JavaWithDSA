public class Print_half_Pyramid_Pattern {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++){
            for(int p = 1; p <= line; p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
