package NumberProgarms;

public class DuckNumber {
    public static boolean isDuck(int num){
        while (num>0){
            int digit =  num % 10;

            if (digit == 0 && num/10 != 0){
                return true;
            }
            num=num/10;
        }
        return false;
    }
}

/*
 ex:   3210 → contains 0 (not at the beginning) → ✅ Duck Number
       707, 102, 1205 → ✅ Duck Numbers
       0123, 0003 → ❌ Not Duck Numbers (starts with 0 — invalid for integers anyway)
 */