import java.util.ArrayList;
import java.util.Random;

public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();
        int[] randomRolls = appTest.getTenRolls();
        for (int roll : randomRolls){
		    System.out.println(roll);
        }
    }
}