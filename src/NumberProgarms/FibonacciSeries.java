package NumberProgarms;

public class FibonacciSeries {
    public static void fibonacci(int num){
        int first =0;
        int second =1;
        System.out.print("Fibonacci Series up to " + num + " terms: ");

        for (int i=1; i<= num; i++){
            System.out.print(first +" ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
//  Fibonacci Series up to 10 terms: 0 1 1 2 3 5 8 13 21 34