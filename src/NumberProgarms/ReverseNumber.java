package NumberProgarms;

public class ReverseNumber {
    public static void reverseNumber(int num){
        int reversed = 0;

        while (num != 0){
            int digit = num % 10;
            reversed = reversed*10 + digit;
            num = num/10;
        }
        System.out.println("Reversed Number is: "+reversed);
    }
}
