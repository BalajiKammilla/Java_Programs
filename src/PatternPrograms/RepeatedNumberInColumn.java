package PatternPrograms;

public class RepeatedNumberInColumn {
    public static void pattern(int number1, int number2){
        for (int i=1; i<=number1; i++){
            for (int j=1; j<=number2; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
