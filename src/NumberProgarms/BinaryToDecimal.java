package NumberProgarms;

public class BinaryToDecimal {
    public static void binToDec(int num){
        int decimal = 0;
        int base=1;

        int temp = num;

        while (temp>0){
            int lastDigit = temp %10;
            decimal = decimal + (lastDigit * base);
            base = base * 2;
            temp = temp/10;
        }
        System.out.println("Decimal of binary "+num+ " is : "+decimal);
    }
}
