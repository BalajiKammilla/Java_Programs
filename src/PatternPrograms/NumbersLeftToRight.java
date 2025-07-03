package PatternPrograms;

public class NumbersLeftToRight {
    public static void numbers(int row, int col){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
        public static void numbers(int row, int col){
        int num =1;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    ex: row 3 col 5
    1 2 3 4 5
    6 7 8 9 10
    11 12 13 14 15
 */