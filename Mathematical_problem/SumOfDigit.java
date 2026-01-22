
public class SumOfDigit {

    static void SumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumDigit(12344);
    }
}
