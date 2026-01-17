public class Pattern6 {
    static void SameNumberPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SameNumberPattern(6);
    }
}
