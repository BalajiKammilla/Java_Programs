package PatternPrograms;

public class BinaryPattern {
    public static void pattern(int num){
        for (int i=1; i<=num; i++){
            int val = (i%2==0)? 0 : 1;
            for (int j=1; j<=i; j++){
                System.out.print(val+" ");
                val=1-val;
            }
            System.out.println();
        }
    }
}
