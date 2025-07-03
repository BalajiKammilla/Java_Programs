package PatternPrograms;

public class InvertedPyramid {
    public static void invertedPyramid(int rows){
        for (int i =0; i<rows; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<rows-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
