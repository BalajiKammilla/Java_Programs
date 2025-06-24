package NumberProgarms;

public class SumOfTheDigits {
    public static void sumOfDigits(int num){
        int sum =0;

        while (num !=0){
            sum = sum + num %10;
            num = num/10;
        }
        System.out.println("Sum of the Given Digits are: "+ sum);
    }
}
