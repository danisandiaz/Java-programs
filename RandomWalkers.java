public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double sum = 0;

        for (int t = 0; t < trials; t++) {
            int steps = 0;
            int y = 0;
            int x = 0;

            while (((Math.abs(x)) + (Math.abs(y))) < r) {
                {
                    steps++;
                }
                double d = Math.random();
                if (d < 0.25) {
                    x++;
                } else if (d < 0.50) {
                    x--;
                } else if (d < 0.75) {
                    y++;
                } else {
                    y--;
                }
                // System.out.println(x + " ," + y);
            }
            // System.out.println("steps" + " = " + steps);
            sum += steps;
        }
        double asteps = (sum / trials);
        System.out.println("Average number of steps  = " + asteps);
    }
}
