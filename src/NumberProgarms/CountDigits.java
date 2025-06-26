package NumberProgarms;

public class CountDigits {
    public static void digitCounter(int num){
        int count =0;

        if (num == 0){
            count =1;
        }else {
            while (num > 0){
                num = num/10;
                count++;
            }
        }
        System.out.println("Total count of the Digits are : "+count);
    }
}
