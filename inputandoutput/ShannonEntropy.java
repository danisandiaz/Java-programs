public class ShannonEntropy {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int sum = 0;
        int[] freq = new int[m + 1];

        while (!StdIn.isEmpty()) {
            int j = StdIn.readInt();
            freq[j]++;
            sum += 1;
        }
        double entropy = 0.0;
        for (int i = 1; i <= m; i++) {
            double p = 1.0 * freq[i] / sum;
            if (freq[i] > 0)
                entropy -= p * Math.log(p) / Math.log(2);
        }
        StdOut.printf("%.4f", entropy);
        System.out.println();
    }
}
