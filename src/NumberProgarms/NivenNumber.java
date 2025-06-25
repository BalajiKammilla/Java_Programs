package NumberProgarms;

public class NivenNumber {
    public static void checkNiven(int num){
        int original = num;
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum = sum+digit;
            num =num/10;
        }
        if (original % sum == 0){
            System.out.println(num +" is a Niven Number");
        }else {
            System.out.println(num + " is not a Niven Number");
        }
    }
}
//ex: 18 is a Niven Number