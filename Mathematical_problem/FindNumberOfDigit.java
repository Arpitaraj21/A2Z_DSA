
public class FindNumberOfDigit {

    static void NumberOfDigit(int n) {
        int count = 0;
        while (n > 0) {
            while (n > 0) {
                int digit = n % 10;
                count++;
                n = n / 10;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        NumberOfDigit(6123);
    }
}
