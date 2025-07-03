package PatternPrograms;

public class Zpattern {
    public static void pattern(int size){
        if (size <=3 ){
            System.out.println("Please Enter size more than 3");
            return;
        }
        for (int i = 1; i<=size; i++){
            for (int j=1; j<=size; j++){
                if (i==1 || i==size || j==(size - i+1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
