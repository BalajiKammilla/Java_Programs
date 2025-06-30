package NumberProgarms;

public class MagicNumber {
    public static void magicNumber(int num){

        int temp = num;
        while (temp>9){
            int sum =0;
            while(temp>0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            temp = sum;
        }
       if (temp == 1){
           System.out.println(num+" is a Magic Number");
       }else {
           System.out.println(num+" is not a Magic Number");
       }
    }
}

/*
A Magic Number is a number whose sum of digits, when repeatedly added until a single digit is obtained, becomes 1.
 Let’s take 1729:
- Sum of digits: 1 + 7 + 2 + 9 = 19
- Sum of 1 + 9 = 10
- Sum of 1 + 0 = 1 ✅ → Magic Number
 */
