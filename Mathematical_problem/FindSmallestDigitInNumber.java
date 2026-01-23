
public class FindSmallestDigitInNumber {

    static void SmallestDigit(int n) {
        int smallest = Integer.MAX_VALUE;
        while (n > 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = n;
            }
            n = n / 10;
        }
        System.out.println("smallest number is " + smallest);
    }

    public static void main(String[] args) {
        SmallestDigit(141236);
    }
}
