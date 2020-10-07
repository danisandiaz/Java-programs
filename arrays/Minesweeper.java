public class Minesweeper {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] mine;
        mine = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mine[i][j] = 0;
            }
        }
        for (int i = 0; i < k; i++) {
            int cor1 = (int) (Math.random() * (row));
            int cor2 = (int) (Math.random() * (col));
            while (mine[cor1][cor2] == 9) {
                cor1 = (int) (Math.random() * (row));
                cor2 = (int) (Math.random() * (col));
            }
            mine[cor1][cor2] = 9;
            for (int u = (cor1 - 1); u <= (cor1 + 1); u++) {
                for (int w = (cor2 - 1); w <= (cor2 + 1); w++)

                    if (((u) >= 0) && ((u) < row) && ((w) >= 0) && ((w)
                            < col) && (mine[u][w] != 9)) {
                        mine[u][w]++;
                    }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mine[i][j] == 9)
                    System.out.print("*  ");
                else
                    System.out.print(mine[i][j] + "  ");


            }
            System.out.println();
        }
    }
}
