import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting for user input
        System.out.print(
                "Please enter digit for guess, 0 = heads and 1 = tails: "
        );

        int guess = input.nextInt();

        // Generating random number for coin toss

        Random randomNumber = new Random();

        int toss = randomNumber.nextInt(2);

        if (toss == 0) {
            if (guess == 0)
                System.out.print(
                        "Result = Heads: you guessed correct... Congratulations"
                );
            else if (guess == 1)
                System.out.print(
                        "Result is Heads: You guessed Tails and therefore wrong"
                );
        }
        else    {
                if (guess == 0)
                    System.out.print(
                            "Result is Tails: You guessed on Heads and loose "
                    );
                else if (guess == 1)
                    System.out.print("The result is Tails: You guessed Tails and therefore you WIN!!! "
                    );
        }
    }
}
