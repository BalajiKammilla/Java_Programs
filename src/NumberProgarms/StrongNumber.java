package NumberProgarms;

public class StrongNumber {
    public static void isStrong(int num){
        int sum =0;
        int temp = num;

        while (temp != 0){
            int digit = temp%10;
            sum = sum + factorial(digit);
            temp = temp/10;
        }
        if (sum == num){
            System.out.println(num+" is a Strong Number");
        }else {
            System.out.println(num+" is not a Strong Number");
        }
    }

    static int factorial(int num){
        int fact=1;
        for (int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
}
//145