import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        PlayerMove pm = new PlayerMove();
        UserInput ui = new UserInput();
        Field f = new Field();
        int[][] field = new int[3][3];
        int mainSideChangeCounter = 0;
        int xo;

        while (true) {
            if (mainSideChangeCounter % 2 == 0) {
                xo = 1;
            } else {
                xo = 2;
            }
            f.PrintField(field);
            if (xo == 1) {
                System.out.println("Where do you want to place X");
            } else {
                System.out.println("Where do you want to place O");
            }
            ui.InputCoordinates();
            int number = ui.number;
            int letter = ui.letter;
            if (pm.CheckCoordinates(field, number, letter)) {
                pm.PlayerMove(field, number, letter, xo);
                mainSideChangeCounter++;
                if (pm.WinnerCheck(field, xo)) {
                    f.PrintField(field);
                    break;
                }
            }
        }
    }
}
