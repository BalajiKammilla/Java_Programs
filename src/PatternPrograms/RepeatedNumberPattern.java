package PatternPrograms;

public class RepeatedNumberPattern {
    public static void pattern(int num){
        for (int i=1; i<= num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
