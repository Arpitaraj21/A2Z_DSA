public class CheckPerfectNumberOptimized {
    static void PerfectNumber(int n){
        if(n <= 1){
            System.out.println("Not a perfecr number");
            return;
        }

        int sum = 1;

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;

                // this for pair
                if(i != n/i){
                    sum += n / i;
                }
            }
        }
        if(sum == n){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
    public static void main(String[] args) {
        PerfectNumber(6);
    }
}
