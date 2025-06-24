package NumberProgarms;

public class PerfectNumber {
    public static boolean isPerfect(int num){
        if (num<=1) return false;

        int sum = 1;
        for (int i=1; i<=num/2; i++){
            if (num % i ==0){
                sum = sum + i;
            }
        }
        if (sum == num){
            return true;
        }
        return false;
    }
}
