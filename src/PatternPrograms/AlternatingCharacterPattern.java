package PatternPrograms;

public class AlternatingCharacterPattern {
    public static void pattern(int num){
        for (int i=1; i<= num; i++){
            for (int j=1; j<=i; j++){
                if ((i +j)%2==0){
                    System.out.print("A ");
                }else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
