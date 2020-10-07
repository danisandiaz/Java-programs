public class TrinomialBrute {
    public static long trinomial(int n, int k) {
        long m;
        if (n == 0 && k == 0) {
            m = 1;
        } else if (k < (-n) || k > n) {
            m = 0;
        } else {
            m = trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);

        }
        return m;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        long x = trinomial(n, k);
        System.out.println(x);

    }
}
