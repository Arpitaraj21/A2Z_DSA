public class PerfectNumber {
    static void FindPerfectNumber(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum += i;
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
        FindPerfectNumber(28);
    }
}
