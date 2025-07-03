package PatternPrograms;

public class CharacterPyramid {
    public static void pattern(int num){
        char ch = 'A';
        for (int i=1; i<=num; i++){
            for (int j=1; j<= num -i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
