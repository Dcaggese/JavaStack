import java.util.Random;

public class PuzzleJava {

    public int[] getTenRolls() {
        Random randomNumber = new Random();
        int[] rolls = new int[10];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = 1 + randomNumber.nextInt(20);
        }
        return rolls;
    }
}