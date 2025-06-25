package NumberProgarms;

public class ArmStrongNumber {
    public static boolean isArmStrong(int num){
        int original = num;
        int numOfDigits = String.valueOf(num).length();
        double sum=0;

        while (num != 0){
            int digit = num%10;
            sum = sum + Math.pow(digit, numOfDigits);
            num =num/10;
        }
        if (original == sum){
            return true;
        }
        return false;
    }
}
//370, 153