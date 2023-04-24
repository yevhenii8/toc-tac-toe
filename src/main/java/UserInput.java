import java.util.Scanner;

public class UserInput {
    int letter;
    int number;

    public void InputCoordinates () {
        Scanner scanner = new Scanner(System.in);
        String letters = ("ABC");
        String coordinates;
        coordinates = scanner.nextLine();
        for (int i = 0; i < letters.length(); i++) {
            if (coordinates.charAt(0) == letters.charAt(i)) {
                letter = i;
            }
        }
        number = Integer.parseInt(coordinates.substring(1)) - 1;
    }
}
