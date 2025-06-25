package NumberProgarms;

public class GCD {
    public static void calculateGcd(int num1, int num2){
        int gcd=1;

        int min= (num1 < num2) ? num1 : num2;

        for(int i=1; i<=min; i++){
            if (num1 % i ==0 && num2 % i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of the Given "+num1+" and"+num2+" numbers are: "+ gcd);
    }
}
//ex:    GCD of 12 and 18 is: 6