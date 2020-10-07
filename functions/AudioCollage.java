public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    // public static double[] amplify(double[] a, double alpha) {


    public static double[] amplify(double[] a, double alpha) {
        // private static double[] note(double hz, double duration, double amplitude) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i] * alpha;
        return b;
    }

    public static double[] reverse(double[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            double temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = temp;
        }
        return a;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        for (int i = 0; i < b.length; i++)
            c[i + a.length] = b[i];
        return c;
    }

    public static double[] mix(double[] a, double[] b) {
        double[] g;
        int maxl;
        // puts larger length as maxl
        if (a.length > b.length) {
            maxl = a.length;
        } else {
            maxl = b.length;
        }

        double[] c = new double[maxl];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];

        double[] d = new double[maxl];
        for (int i = 0; i < b.length; i++)
            d[i] = b[i];

        g = new double[maxl];
        for (int i = 0; i < maxl; i++) {
            g[i] = c[i] + d[i];
        }
        return g;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        int n = (int) (a.length / alpha);
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            int j = (int) (i * alpha);
            c[i] = a[j];

        }
        return c;

    }


    public static void main(String[] args) {
        double alpha = 2;
        double[] sounds = StdAudio.read("beatbox.wav");
        double[] scratch = StdAudio.read("scratch.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] singer = StdAudio.read("singer.wav");


        double[] amp = amplify(sounds, alpha);
        StdAudio.play(amp);
        double[] rev = reverse(sounds);
        StdAudio.play(rev);
        double[] mer = merge(sounds, scratch);
        StdAudio.play(mer);
        double[] mx = mix(piano, harp);
        StdAudio.play(mx);
        double[] chanSp = changeSpeed(singer, alpha);
        StdAudio.play(chanSp);

    }
}
