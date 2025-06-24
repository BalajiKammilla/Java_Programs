package NumberProgarms;

public class Factorial {
    public static void fact(int num){
        int fact =1;

        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
