package NumberProgarms;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;

        while (num != 0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num/10;
        }
        if (original == reversed){
            return true;
        }
        return false;
    }
}
