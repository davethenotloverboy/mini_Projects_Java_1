import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to the RPS game.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int compScore = 0;
        int userScore = 0;

        System.out.print("Are you ready? ");
        String userReady = scanner.nextLine();
        System.out.println("Ready or not, here we gooo! ");
        System.out.println("How many rounds do you wanna play?");
        int numOfRounds = scanner.nextInt();
        //System.out.println("How about last round points? ");
        //int lastPoints = scanner.nextInt();

        for(int i = 0; i <= (numOfRounds-1); i++) {
            System.out.println("\nOkay round " + (i + 1));
            System.out.print("Pick one(enter only 1 number): ");
            System.out.println("  1.Rock   2.Paper   3.Scissors");
            int userAnswer = scanner.nextInt();
            int programNum = random.nextInt(3);
            switch (userAnswer) {
                case 1:
                    switch (programNum + 1) {
                        case 1:
                            System.out.println("Mine is Rock! Yours is Rock also?");
                            System.out.println("It's a tie");
                            break;
                        case 2:
                            System.out.println("Mine is Paper!");
                            System.out.println("You lose!");
                            compScore += 1;
                            break;
                        case 3:
                            System.out.println("Man, yours is Paper?");
                            System.out.println("Okay, you win.");
                            userScore += 1;
                            break;
                    }
                    break;
                case 2:
                    switch (programNum + 1) {
                        case 1:
                            System.out.println("Paper? Man my rock loses!");
                            System.out.println("Okay, your win.");
                            userScore += 1;
                            break;
                        case 2:
                            System.out.println("Both paper.");
                            System.out.println("Okay It's a tie.");
                            break;
                        case 3:
                            System.out.println("I chose scissors!");
                            System.out.println("You lose! Hahaha.");
                            compScore += 1;
                            break;
                    }
                    break;
                case 3:
                    switch (programNum + 1) {
                        case 1:
                            System.out.println("Haha loser!!!");
                            System.out.print("I chose rock!");
                            compScore += 1;
                            break;
                        case 2:
                            System.out.println("Aw. Okay the win is yours this round.");
                            System.out.print("Haha I concede.");
                            userScore += 1;
                            break;
                        case 3:
                            System.out.println("Scissors vs scissors");
                            System.out.println("Okay, it's a tie.");
                            break;
                    }
                    break;
            }
        }

        System.out.println("\nSo who do you think won??");
        System.out.println("Your score: " + userScore + "\nMy score: " + compScore);
        if(userScore > compScore) {
            System.out.println("Dang it! You won, congratulations though.");
        } else if (compScore > userScore) {
            System.out.println("Hahaha, I won men! Loser ass");
        } else {
            System.out.println("Haha, a tie, I guess we'll know who's better on another day.");
        }
    }
}