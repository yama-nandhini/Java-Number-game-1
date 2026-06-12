import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too High!");
            } else if (guess < randomNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! Correct Number.");
            }

        } while (guess != randomNumber);

        sc.close();
    }
}