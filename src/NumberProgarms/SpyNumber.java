package NumberProgarms;

public class SpyNumber {
    public static void spy(int num){
        int sum =0;
        int product=1;
        int temp =num;

        while (temp>0){
            int digit = temp % 10;
            sum= sum+digit;
            product=product*digit;
            temp=temp/10;
        }
        if (sum==product){
            System.out.println(num+ " is a Spy Number");
        }
        else {
            System.out.println(num+" is not a Spy Number");
        }
    }
}

/*
Take 1124:

Digits: 1, 1, 2, 4

Sum = 1 + 1 + 2 + 4 = 8

Product = 1 × 1 × 2 × 4 = 8

Since sum == product → ✅ Spy Number
 */
