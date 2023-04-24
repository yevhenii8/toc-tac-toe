import java.sql.SQLOutput;

public class PlayerMove {
    public boolean CheckCoordinates (int[][] field, int number, int letter) {
        if ((number > 2 || number < 0 || letter > 2 || letter < 0)) {
            System.out.println("Wrong coordinates");
            return false;
        } else if (field[number][letter] > 0) {
            System.out.println("Wrong coordinates");
            return false;
        }
        return true;
    }

    public void PlayerMove(int[][] field, int number, int letter, int xo) {
        switch (xo) {
            case 1: {
                field[number][letter] = 1;
                break;
            }
            case 2: {
                field[number][letter] = 2;
                break;
            }
        }
    }

    public boolean WinnerCheck(int[][] field, int xo) {
        for (int i = 0; i < field.length; i++) {
            int xoRow = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == xo) {
                    xoRow++;
                    if (xoRow == field.length) {
                        System.out.println(xo == 1? "X is win" : "O is win");
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            int xoRow = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == xo) {
                    xoRow++;
                    if (xoRow == field.length) {
                        System.out.println(xo == 1? "X is win" : "O is win");
                        return true;
                    }
                }
            }
        }
        int xoRow = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == xo) {
                xoRow++;
                if (xoRow == field.length) {
                    System.out.println(xo == 1? "X is win" : "O is win");
                    return true;
                }
            }
        }
        xoRow = 0;
        for (int i = 0, j = field.length - 1; i < field.length; i++, j--) {
            if (field[i][j] == xo) {
                xoRow++;
                if (xoRow == field.length) {
                    System.out.println(xo == 1? "X is win" : "O is win");
                    return true;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Draw");
        return true;
    }
}
