package NumberProgarms;

public class PrimeNumbersInRange {
    public static void primeNumbers(int num){
        if (num<=1){
            System.out.println(" no prime numbers in this range");
            return;
        }
        for (int i=2; i<= num; i++){
            boolean isPrime = true;
            for (int j=2; j<=i/2; j++){
                if (i % j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }

    }
}
