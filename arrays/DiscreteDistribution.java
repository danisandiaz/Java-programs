public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = (args.length - 1);
        int[] a = new int[n];
        int sum = 0;
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            sum += a[i];
            s[i] = sum;

            // System.out.println(sum + " " + a[i] + " " + s[i]);
        }
        for (int k = 0; k < m; k++) {
            int r = (int) (Math.random() * sum);
            //System.out.println(r);

            for (int i = 1; i < n; i++) {
                if (r > 0 && r <= s[0]) {
                    System.out.print(i + " ");
                    break;
                } else if (r < s[i] && r >= s[i - 1]) {
                    System.out.print(i + 1 + " ");
                }

            }
        }
    }

}
