import java.math.BigDecimal;
import java.math.BigInteger;

public class Multiplier {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c, int d) {
        return multiply(a,b) * multiply(c,d);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static int multiply(int[] a) {
        int result = 1;
        for(int i : a){
            result *= i;
        }
        return result;
    }

}
