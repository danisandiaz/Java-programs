public class WorldMap {
    public static void main(String[] args) {

        int x1 = StdIn.readInt();
        int y1 = StdIn.readInt();
        StdDraw.setCanvasSize(x1, y1);
        StdDraw.setXscale(0, x1);
        StdDraw.setYscale(0, y1);

        StdDraw.enableDoubleBuffering();
        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int value = StdIn.readInt();
            double[] x = new double[value];
            double[] y = new double[value];

            for (int k = 0; k < value; k++) {
                double j = StdIn.readDouble();
                x[k] = j;
                double d = StdIn.readDouble();
                y[k] = d;
            }

            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
