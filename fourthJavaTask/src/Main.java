import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi and Welcome to the Quiz!");
        System.out.print("Are you ready? ");

        int correct = 0;
        int wrong = 0;
        Scanner scanner = new Scanner(System.in);
        String userReady = scanner.nextLine();
        if(userReady.equalsIgnoreCase("yes")){
            System.out.println("Good let's start");
        }else{
            System.out.println("I don't care. Okay let's start");
        }
        System.out.println("Enter the letter of the correct answer.");

        System.out.println("What is the basic unit of life? ");
        System.out.println("a.Cell   b.Tissue   c.Organ");
        String userAnswerOne = scanner.nextLine();
        System.out.println("Okay next!");

        System.out.println("What is the capital of the Philippines? ");
        System.out.println("a.Davao  b.Manila  c.Cebu");
        String userAnswerTwo = scanner.nextLine();
        System.out.println("Okay next!");

        System.out.println("How many days are in February during a leap year? ");
        System.out.println("a.29  b.28  c.30");
        String userAnswerThree = scanner.nextLine();
        System.out.println("Okay next!");

        System.out.println("Last Question!");
        System.out.println("When was the orchestrated defeat of the Spaniards from the Americans? ");
        System.out.println("a.1898  b.1873  c.1832");
        String userAnswerFour = scanner.nextLine();

        System.out.println("Now let us see if your answers are correct.");
        //number1
        System.out.println("Number one. What is the basic unit of life? ");
        if(userAnswerOne.equalsIgnoreCase("a")){
            System.out.println("You answered a.cells");
            System.out.println("You are correct!");
            correct += 1;
        }else{
            System.out.println("You are wrong!");
            wrong += 1;
        }

        //number2
        System.out.println("For number 2...");
        if(userAnswerTwo.equalsIgnoreCase("b")){
            System.out.println("You are correct!");
            correct += 1;
        }else{
            System.out.println("You are wrong");
            wrong += 1;
        }

        //number3
        System.out.println("For number 3...");
        if(userAnswerThree.equalsIgnoreCase("b")){
            System.out.println("You are correct!");
            correct += 1;
        }else{
            System.out.println("You are wrong!");
            wrong += 1;
        }

        //number4
        System.out.println("Okay for the last question.\n Question number 4...");
        if(userAnswerFour.equalsIgnoreCase("a")){
            System.out.println("You are correct!");
            correct += 1;
        }else{
            wrong += 1;
        }

        System.out.println("You have "+ correct + " correct answers!");
        System.out.print("You also have " + wrong + " wrong answers!");
    }
}