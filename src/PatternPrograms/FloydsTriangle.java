package PatternPrograms;

public class FloydsTriangle {
    public static void pattern(int num){
        int number=1;
        for (int i=1; i<=num; i++){

            for (int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
}
