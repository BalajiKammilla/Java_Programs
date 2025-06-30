package NumberProgarms;

public class CountEvenAndOddNumbers {
    public static void countNumbers(int num){
        int even =0, evenCount = 0;
        int odd=0, oddCount = 0;

        while (num>0){
            int digit = num%10;

            if (digit%2==0){
                even=even+digit;
                evenCount++;
            }else {
                odd=odd+digit;
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("Even Digits :- Count: "+evenCount+" and Sum : "+even );
        System.out.println("Odd Digits :- Count: "+oddCount+" odd Sum : "+odd);
    }
}
