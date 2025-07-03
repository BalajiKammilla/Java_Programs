package NumberProgarms;

public class DecimalToBinary {
    public static void convertToBinary(int num){
        int [] binary = new int[32];
        int index =0;

        int temp = num;
        if (temp == 0){
            System.out.println("Binary is: 0");
            return;
        }
        while (temp>0){
            binary[index] = temp%2;
            temp=temp/2;
            index++;
        }

        System.out.println("Binary of "+num+" is :");
        for (int i=index-1; i>=0; i--){
            System.out.print(binary[i]);
        }
    }
}
