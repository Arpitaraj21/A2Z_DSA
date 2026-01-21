
public class Pattern13 {

    static void FloydTriangle(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle(5);
    }
}
