import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much is your total budget? ");
        double tripBudget = scanner.nextDouble();

        System.out.print("How about your flight cost? ");
        double flightCost = scanner.nextDouble();

        System.out.print("How about your hotel stay? ");
        double lodgingCost = scanner.nextDouble();

        System.out.print("How many nights are you going to stay? ");
        int numOfNights = scanner.nextInt();

        double totExpenses = flightCost + (lodgingCost*numOfNights);
        System.out.println("Your total expenses is "+ totExpenses);

        double budgetUpdate = tripBudget - totExpenses;

        if (budgetUpdate>0){
            System.out.println("Your budget is fine. You still have extra money! Have a happy trip!");
        } else if (budgetUpdate<0) {
            System.out.println("Oh no you do not have enough budget for the trip! Adjust your budget or expenses!");
        } else if (tripBudget==totExpenses) {
            System.out.println("Oh you have exact budget for the trip! Be careful not to overspend!");
        }
    }
    }
