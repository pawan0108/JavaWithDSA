
public class Print_Numbers_With_Continue {
    public static void main(String args[]) {

        // //Using For Loop

        // // for(int i = 1; i <= 10; i++){
        // // // if (i == 3) {
        // // // continue;
        // // // }

        // // if (i == 3 || i==7) {
        // // continue;
        // // }
        // // System.out.println(i);
        // // }

        // //Using Do while Loop

        int i = 1;
        do {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        while (i <= 10);
    }
}
