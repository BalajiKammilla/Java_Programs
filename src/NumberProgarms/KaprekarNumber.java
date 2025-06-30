package NumberProgarms;

public class KaprekarNumber {
    public static void kaprekar(int num){
        int square = num * num;
        int temp = square;
        int count = 0;

        int digitCounter = num;
        while (digitCounter > 0){
            count++;
            digitCounter = digitCounter/10;
        }

        int divisor = 1;
        for (int i=1; i<=count; i++){
            divisor *=10;
        }

        int right = square % divisor;
        int left= square / divisor;

        if (left + right  == num){
            System.out.println(num+" is a Kaprekar Number");
        }
        else {
            System.out.println(num+" is not a Kaprekar Number");
        }
    }
}

/*
    If you square the number, and then split the square into two parts,
     the sum of those parts equals the original number.

     -45² = 2025 → split as 20 and 25 → 20 + 25 = 45 ✅
     -9² = 81 → split as 8 and 1 → 8 + 1 = 9 ✅
     -297² = 88209 → split as 88 and 209 → 88 + 209 = 297 ✅
 */