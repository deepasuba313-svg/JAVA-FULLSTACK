public class Factorialsum {

    public static void main(String[] args) {

        int a = 4;

        for (int i = 1; i <= a; i++) {

            // Print spaces
            for (int j = 4; j >= a - i; j--) {
                System.out.print(".");
            }

            // Print stars
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}