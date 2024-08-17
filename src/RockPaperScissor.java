import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'r' for Rock, 'p' for Paper, or 's' for Scissors:");

        while (true) {
            String userChoice = scanner.next();

            if (!userChoice.equalsIgnoreCase("r") &&!userChoice.equalsIgnoreCase("p") &&!userChoice.equalsIgnoreCase("s")) {
                System.out.println("Invalid input. Please enter 'r' for Rock, 'p' for Paper, or 's' for Scissors:");
                continue;
            }

            int computerChoice = random.nextInt(3);

            String[] choices = {"Rock", "Paper", "Scissors"};
            String computerChoiceText = choices[computerChoice];

            System.out.println("Computer chose " + computerChoiceText);

            if (userChoice.equalsIgnoreCase(computerChoiceText)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("r") && computerChoiceText.equalsIgnoreCase("Scissors"))
                    || (userChoice.equalsIgnoreCase("p") && computerChoiceText.equalsIgnoreCase("Rock"))
                    || (userChoice.equalsIgnoreCase("s") && computerChoiceText.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}