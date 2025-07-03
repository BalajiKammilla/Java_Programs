package NumberProgarms;

public class SumOfNaturalNumbers {
    public static void sumOfNumbers(int num){
        int sum =0;

        for (int i =1; i<= num; i++){
            sum = sum+i;
            System.out.print(sum +" ");

        }
        System.out.println("\nTotal sum is: "+sum);
    }
}
