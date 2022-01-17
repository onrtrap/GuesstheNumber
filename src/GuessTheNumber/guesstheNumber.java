package GuessTheNumber;
import java.util.Scanner;
public class guesstheNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Scanner replay = new Scanner(System.in);
        int correctGuess;
        String name;
        String play;
        int guessInput;
        boolean complete = false;
        boolean won = false;
        System.out.println("Hello! What is your name?");
        name = in.nextLine();
        try {

        } catch (Exception e) {
            name = "Amadeus";
        }
        while (!complete) {
            correctGuess = (int) ((Math.random() * 20) + 1);
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
            for (int i = 0; i < 6; i++) {
                if (!won) {
                    System.out.println("Take a guess.");
                    guessInput = in.nextInt();
                    try {
                        if (!(guessInput < 1) && !(guessInput > 20)) {
                            if (guessInput > correctGuess)

                                System.out.println("Your guess is too high.");

                            else if (guessInput < correctGuess)

                                System.out.println("Your guess is too low.");

                            else if (guessInput == correctGuess) {
                                System.out.println("Good job, " + name + "! You guessed my number in " + i + 1 + " guesses!");
                                won = true;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Choose a number between 1 and 20.");
                    }

                }

                if (!won) {
                    System.out.println("Sorry but you ran out of guesses.  You lose!");
                }
                System.out.println("Would you like to play again? (y or n)");
                play = replay.nextLine();
                if (play.equals("y")) {
                    won = false;
                } else if (play.equals("n"))
                    complete = true;
            }
            in.close();
        }


    }
}
