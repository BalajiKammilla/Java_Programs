package PatternPrograms;

public class Rectangle {
    public static void pattern(int row, int col){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
