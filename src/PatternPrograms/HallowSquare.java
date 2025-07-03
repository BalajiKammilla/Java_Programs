package PatternPrograms;

public class HallowSquare {
    public static void pattern(int size){
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                if (i==1 || i==size || j==1 || j==size){
                    System.out.print("* ");
                }else {
                    System.out.print("  "); //two spaces
                }
            }
            System.out.println();
        }
    }
}
