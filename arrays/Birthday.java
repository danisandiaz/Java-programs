public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] experiment = new int[n];
        for (int t = 0; t < trials; t++) {
            boolean[] hasBirthday = new boolean[n];
            for (int k = 0; k < n; k++) {
                int d = (int) ((n - 1) * Math.random());
                if (hasBirthday[d]) {
                    experiment[k] += 1;
                    break;
                }
                hasBirthday[d] = true;
            }
        }

        double[] f = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += experiment[i];
            f[i] = sum;
        }

        for (int j = 0; j < n; j++) {
            double fraction = f[j] / trials;
            int z = j + 1;
            System.out.print(z);
            System.out.print("\t" + experiment[j]);
            System.out.print("\t" + fraction);
            System.out.println();
            if (fraction >= 0.5) {
                break;
            }
        }


    }
}


