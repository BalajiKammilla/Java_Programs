package NumberProgarms;

public class HappyNumber {
    public static boolean isHappyNumber(int num){
        int slow = num;
        int fast= num;
        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        }while (slow != fast);
        return slow==1;
    }

    public static int findSquareSum(int num){
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum = sum+digit * digit;
            num = num/10;
        }
        return sum;
    }
}
/*
     Example:
     Take 19:   until it becomes 1

        - 1² + 9² = 1 + 81 = 82
        - 8² + 2² = 64 + 4 = 68
        - 6² + 8² = 36 + 64 = 100
        - 1² + 0² + 0² = 1 ✅ → Happy Number
 */