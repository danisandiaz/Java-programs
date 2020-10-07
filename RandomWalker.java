public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int y = 0;
        int x = 0;
        int steps = 0;

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
            System.out.println(x + " ," + y);
        }


        System.out.println("steps" + " = " + steps);
    }

}
