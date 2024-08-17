import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100");

        while (true) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}