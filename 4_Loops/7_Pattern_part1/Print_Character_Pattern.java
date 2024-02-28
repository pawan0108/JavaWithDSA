public class Print_Character_Pattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for(int line = 1; line<=4; line++){

// this is for inverse Characters

            // for(int alpha = 1; alpha<=n-line+1; alpha++)

            for(int alpha = 1; alpha<=line; alpha++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
