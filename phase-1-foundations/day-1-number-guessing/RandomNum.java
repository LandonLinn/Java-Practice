import java.util.Scanner;

public class RandomNum {
    private int random;

    public int getRandom() {
        return (int) ((Math.random() * 10) + 1);
    }

    public void playGame() {
        // Get random
        random = getRandom();

        // User Input
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Guess a number 1-10: ");

            // Check for integer
            try {
                int userGuess = Integer.parseInt(sc.nextLine());

                // Check for out of bounds errors
                if (userGuess > 10 || userGuess < 1) {
                    System.out.println("Enter a # between 1-10");
                    continue;
                } else if (userGuess != random) { // Check for if guess is the random number
                    System.out.println("Sorry, guess again: ");
                    continue;
                } else { // Correct answer
                    System.out.println("Correct! The answer is: " + random);
                    break;
                }
            } catch (Exception e) {
                // Restart
                System.out.println("Enter a number");
                continue;
            }
        }

    }

}
