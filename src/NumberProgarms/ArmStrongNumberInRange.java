package NumberProgarms;

public class ArmStrongNumberInRange {
    public static void armStrong(int num){
        System.out.println("Arm Strong Numbers are :");
        for (int n=1; n<=num; n++){
            int temp = n;
            int count=0;

            int digitCounter = temp;
            while (digitCounter > 0 ){
                count++;
                digitCounter = digitCounter/10;
            }
            int sum =0;
            int checker=n;

            while (checker > 0){
                int digit = checker % 10;
                int power = 1;

                for (int i=1; i<=count; i++){
                    power = power * digit;
                }

                sum = sum+power;
                checker = checker/10;
            }
            if (sum == n){
                System.out.println(n);
            }
        }
    }
}
