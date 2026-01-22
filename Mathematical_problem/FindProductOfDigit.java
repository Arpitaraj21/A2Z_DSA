
public class FindProductOfDigit {

    static void ProductOfDigit(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        ProductOfDigit(123);
    }
}
