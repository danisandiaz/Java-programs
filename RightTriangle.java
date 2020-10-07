public class RightTriangle {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        int square1 = side1 * side1;
        int square2 = side2 * side2;
        int square3 = side3 * side3;

        System.out.println((square1 == square2 + square3) ||
                (square2 == square1 + square3) ||
                (square3 == square1 + square2));


    }
}
