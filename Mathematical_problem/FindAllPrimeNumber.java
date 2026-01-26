public class FindAllPrimeNumber{
    static void PrimeNumber(int start, int end){
        for(int i=start; i<= end; i++){
            if(i <= 1) continue;

            boolean isPrime = true;

            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrimeNumber(1, 20);
    }
}