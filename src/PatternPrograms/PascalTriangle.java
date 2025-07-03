package PatternPrograms;

public class PascalTriangle {
    public static void pattern(int row){
        for (int i=0; i<= row; i++){

            int number =1;

            for (int j=0; j<= row - i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print(number+" ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
