package NumberProgarms;

public class LCM {
    public static void calculateLcm(int num1, int num2){
        int lcm;

        int max = (num1 > num2) ? num1:num2;

        while (true){
            if (max%num1==0 && max%num2==0){
                lcm=max;
                break;
            }
            max++;
        }

        System.out.println("LCM of Given "+num1+" and "+num2+" is:"+lcm);
    }
}
//  ex: LCM of 8 and 12 is: 24