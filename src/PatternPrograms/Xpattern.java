package PatternPrograms;

public class Xpattern {
    public static void pattern(int size){
        if (size <3 || size%2==0){
            System.out.println("Please Enter a Odd Number");
            return;
        }
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                if (j==i || j==(size - i+1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
