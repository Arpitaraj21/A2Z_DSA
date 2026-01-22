
public class CheckPositiveNegative {

    static void CheckNumber(int n) {
        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        CheckNumber(5);
    }
}
