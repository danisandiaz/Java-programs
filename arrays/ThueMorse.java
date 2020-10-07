public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);


        int z = 1;
        while (z <= n) {
            z *= 2;
        }
        boolean[] sequence = new boolean[z];

        for (int i = 1; i < z; i *= 2) {
            for (int j = 0; j < i; j++) {
                sequence[j + i] = !sequence[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (sequence[i] == sequence[k]) {
                    System.out.print("+" + "  ");
                } else {
                    System.out.print("-" + "  ");
                }
            }
            System.out.println();
        }
    }

}

