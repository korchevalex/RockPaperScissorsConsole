import java.util.Random;
import java.util.Scanner;

public class GameCode {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;

        while(true) {
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scanner.nextLine().toLowerCase();
            switch (playerMove) {
                case "r", "rock" -> playerMove = ROCK;
                case "p", "paper" -> playerMove = PAPER;
                case "s", "scissors" -> playerMove = SCISSORS;
                default -> {
                    System.out.println("Invalid input! Try again!");
                    continue;
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
            System.out.println("The computer chose " + computerMove + ".");

            if (computerMove.equals(playerMove)) {
                System.out.println("Draw!");
            } else if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(PAPER) && computerMove.equals(ROCK)) || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }
            System.out.println("Player score: " + playerScore);
            System.out.println("Computer score: " + computerScore);

            while (true) {
                System.out.println("Play again?[y]es/[n]o");
                String playAgainDecision = scanner.nextLine().toLowerCase();
                if (playAgainDecision.equals("n") || playAgainDecision.equals("no")) {
                    return;
                } else if (playAgainDecision.equals("y") || playAgainDecision.equals("yes")) {
                    break;
                } else {
                    System.out.println("Invalid input! Try again!");
                }
            }
        }

    }
}
