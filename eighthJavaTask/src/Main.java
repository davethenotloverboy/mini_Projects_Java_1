import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Integer[] numList = {1,2,3,4,5};
        int compGuess = numList[random.nextInt(1,5)];

        System.out.println("Hi and welcome to the Simple Guessing Game. ");
        System.out.println("If you guess the number you win.");
        System.out.println("There are numbers, 3 rounds, will you guess the number?");
        System.out.println("Or will you lose?");

        System.out.println("Okay game start!");

        for (int i = 0; i < 2; i++) {
            System.out.println("What could the number be? What's your guess? ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();
            if (userGuess == compGuess) {
                System.out.println("Wow! You guessed it! You win!");
                System.out.println("You guessed the number in "+ (i+1) +" turn/s!");
                System.exit(0);
            } else {
                System.out.print("Wrong!\nTry again!\n");
            }
        }
        System.out.println("Last chance!");
        System.out.println("What could the number be? What's your guess? ");
        int userGuessLast = scanner.nextInt();
        scanner.nextLine();
        if (userGuessLast==compGuess){
            System.out.println("Wow! You guessed it! You win!");
            System.out.println("You guessed the number in your last turn! What a clutch!");
        }else{
            System.out.println("Aw. Too bad! Try again next time!");
            System.out.println("Number: "+compGuess);
        }
    }
}