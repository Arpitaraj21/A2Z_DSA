public class ArmstrongNumber{
    static void CheckArmstrongNumber(int n){
        int originalNumber = n;
        int sum = 0;
        int count = 0;

        int temp = n;
        while(temp > 0) {
            count++;
            temp = temp/10;
        }

        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        if(sum == originalNumber){
            System.out.println("Is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
    public static void main(String[] args) {
        CheckArmstrongNumber(173);
    }
}