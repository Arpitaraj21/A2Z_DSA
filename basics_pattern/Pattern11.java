
public class Pattern11 {

    static void NumberPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPyramid(5);
    }
}
