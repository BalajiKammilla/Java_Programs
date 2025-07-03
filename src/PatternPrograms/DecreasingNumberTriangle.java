package PatternPrograms;

public class DecreasingNumberTriangle {
    public static void pattern(int rows){
        for (int i=1; i<=rows; i++){
            int num = rows;
            for (int j=1; j<= i; j++){
                System.out.print(num--+" ");
            }
            System.out.println();
        }
    }
}
