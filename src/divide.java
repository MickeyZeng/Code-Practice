public class divide {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0)
            return Integer.MAX_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        return dividend/divisor;
    }

}
