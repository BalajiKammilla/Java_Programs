package PatternPrograms;

public class HallowPyramid {
    public static void pattern(int rows){
        for (int i=1; i<=rows; i++ ){
            for (int j=1; j<=rows - i; j++){
                System.out.print(" ");
            }
            for (int k=1; k <= (2 * i-1); k++){
                if (k==1 || k == (2*i-1) || i==rows){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
