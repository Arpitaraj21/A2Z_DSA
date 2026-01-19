
public class Pattern11 {

    static void NumberPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        NumberPyramid(5);
    }
}
