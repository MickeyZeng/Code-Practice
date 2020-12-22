public class pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x,n));
    }

    public static double myPow(double x, int n) {
        if (x == -1) {
            if ((n & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        }
        if (x == 1.0f)
            return 1;

        double mul = 1;
        if (n > 0) {
            mul = powRecursion(x, n);
        } else {
            n = -n;
            mul = powRecursion(x, n);
            mul = 1 / mul;
        }
        return mul;
    }

    public static double powRecursion(double x, int n){
        if (n == 0) {
            return 1;
        }
        if((n & 1) == 0){
            double result = powRecursion(x, n / 2);
            return result * result;
        }else{
            double result = powRecursion(x, n/2);
            return result * result * x;
        }
    }
}
