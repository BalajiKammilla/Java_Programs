package PatternPrograms;

public class NumbersInPyramid {
    public static void numbers(int rows){
        int num =1;
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
