
public class CheckPalindromeNumber {

    static void PalindromeNumber(int n) {
        int rev = 0;
        int originalNum = n;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev == originalNum) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber(1216);
    }
}
