package PatternPrograms;

public class PascalRightAngleTriangle {
    public static void pattern(int num){
        for (int i=0; i<= num; i++){
            int number=1;

            for (int j=0; j<=i; j++){
                System.out.print(number+" ");
                number = number * (i - j)/(j + 1);
            }
            System.out.println();
        }
    }
}
