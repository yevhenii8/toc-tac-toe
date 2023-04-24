public class Field {
    public void PrintField(int[][] field) {
        String letters = ("    A  B  C");
        System.out.println(letters);

        for (int i = 0; i < field.length; i++) {
            if ((i + 1) != 10) {
                System.out.print((i + 1) + "  |");
            } else {
                System.out.print((i + 1) + " |");
            }
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) {
                    System.out.print(" " + " |");
                } else if (field[i][j] == 1) {
                    System.out.print("X" + " |");
                } else if (field[i][j] == 2) {
                    System.out.print("O" + " |");
                }
            }
            System.out.println();
        }
    }
}
