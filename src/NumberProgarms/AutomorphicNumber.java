package NumberProgarms;

public class AutomorphicNumber {
    public static void checkAutomorphic(int num){
        int square = num * num;
        int temp =num;
        int count =0;

        while (temp>0){
            count++;
            temp=temp/10;
        }

        int power=1;
        for (int i=1; i<=count; i++){
            power =power*10;
        }

        int lastDigits = square%power;

        if (lastDigits == num){
            System.out.println(num+" is an Automorphic Number");
        }else {
            System.out.println(num+ " is not an Automorphic Number");
        }
    }
}


/*
5² = 25 → ends with 5 → ✅ Automorphic

76² = 5776 → ends with 76 → ✅ Automorphic

25² = 625 → does not end with 25 → ❌ Not automorphic
 */