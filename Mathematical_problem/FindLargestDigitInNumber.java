
public class FindLargestDigitInNumber {

    static void LargestDigitInNumber(int n) {
        int maxDigit = Integer.MIN_VALUE;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n = n / 10;
        }
        System.out.println("max digit is " + maxDigit);
    }

    public static void main(String[] args) {
        LargestDigitInNumber(81345);
    }
}
