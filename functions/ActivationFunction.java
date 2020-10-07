public class ActivationFunction {
    public static double heaviside(double x) {
        if (x < 0) {
            x = 0.0;
        } else if (x == 0) {
            x = 0.5;
        } else if (x > 0) {
            x = 1;
        }
        return x;
    }

    public static double sigmoid(double x) {
        double b = 1 / (1 + Math.exp(-x));
        return b;
    }

    public static double tanh(double x) {
        double c = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return c;
    }

    public static double softsign(double x) {
        double d = x / (1 + Math.abs(x));
        return d;
    }

    public static double sqnl(double x) {
        if (x <= -2) {
            x = -1.0;
        } else if (x > -2 && x < 0) {
            x = (x + (Math.pow(x, 2) / 4));
        } else if (x >= 0 && x < 2) {
            x = (x - (Math.pow(x, 2) / 4));
        } else if (x >= 2) {
            x = (1);
        }
        return x;
    }

    public static void main(String[] args) {
        double x;
        try {
            x = Double.parseDouble(args[0]);
            double a = heaviside(x);
            System.out.println("heaviside(" + x + ") = " + a);
            double b = sigmoid(x);
            System.out.println("sigmoid(" + x + ") = " + b);
            double c = tanh(x);
            System.out.println("tanh(" + x + ") = " + c);
            double d = softsign(x);
            System.out.println("softsign(" + x + ") = " + d);
            double e = sqnl(x);
            System.out.println("sqnl(" + x + ") = " + e);
        } catch (NumberFormatException ex) {
            System.out.println("NaN");
            System.out.println("NaN");
            System.out.println("NaN");
            System.out.println("NaN");
            System.out.println("NaN");


        }


    }
}
