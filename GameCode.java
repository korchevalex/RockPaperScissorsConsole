import java.util.Random;
import java.util.Scanner;

public class GameCode {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine().toLowerCase();
        switch (playerMove) {
            case "r", "rock" -> playerMove = ROCK;
            case "p", "paper" -> playerMove = PAPER;
            case "s", "scissors" -> playerMove = SCISSORS;
            default -> {
                System.out.println("Invalid input!");
                return;
            }
        }

        Random random = new Random();
        int computerNumber = random.nextInt(3);
        String computerMove = "";
        switch (computerNumber) {
            case 0 -> computerMove = ROCK;
            case 1 -> computerMove = PAPER;
            case 2 -> computerMove = SCISSORS;
        }
        System.out.println("The computer chose " + computerMove);

        if (computerMove.equals(playerMove)) {
            System.out.println("Draw");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(PAPER) && computerMove.equals(ROCK)) || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose");
        }
    }
}
