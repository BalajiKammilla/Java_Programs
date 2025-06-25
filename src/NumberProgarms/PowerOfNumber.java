package NumberProgarms;

public class PowerOfNumber {
    public static void powerOfNumber(int base, int exponent){
        int result =1;

        for (int i=1; i<=exponent; i++){
         result = result*base;
        }
        System.out.println(base +" ^ "+exponent+" = "+result);
    }
}
//ex:   2^4 = 16