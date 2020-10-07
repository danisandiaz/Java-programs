public class Divisors {
    public static int gcd(int a, int b) {
        //  int gcd = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        // for (int i = 1; i <= a && i <= b; i++)
        //   if (a % i == 0 && b % i == 0)
        //     gcd = i;

        // return gcd;

        if (b == 0) return a;
        else return (gcd(b, a % b));
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }

    public static boolean areRelativelyPrime(int a, int b) {
        int val = gcd(a, b);
        boolean bool = (val == 1);
        return bool;
    }

    public static int totient(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            boolean m = areRelativelyPrime(i, x);
            if (m == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = Math.abs(Integer.parseInt(args[0]));
        int b = Math.abs(Integer.parseInt(args[1]));
        int j = gcd(a, b);
        System.out.println("gcd(" + a + ", " + b + ")" + " = " + j);
        int k = lcm(a, b);
        System.out.println("lcm(" + a + ", " + b + ")" + " = " + k);
        boolean m = areRelativelyPrime(a, b);
        System.out.println("areRelativelyPrime(" + a + ", " + b + ")" + " = " + m);
        int n = totient(a);
        System.out.println("totient(" + a + ")" + " = " + n);
        int o = totient(b);
        System.out.println("totient(" + b + ")" + " = " + o);
    }
}
