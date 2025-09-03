
//okay this is a start
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Hi! Welcome to the calorie Tracker App!");

    Scanner scanner = new Scanner(System.in);
        double calBurned = 0;
        System.out.println("Did you do cardio today? true/false");
        boolean cardio = scanner.nextBoolean();
        if(cardio){
            calBurned += 150;
        }else{
            calBurned += 0;
            double calCardioTime = 0;
        }

        System.out.println("Enter the number of pull-ups today: ");
        double pullUps = scanner.nextDouble();

        if (cardio) {
            System.out.println("How many minutes did you do cardio? ");
            double cardioTime = scanner.nextDouble();
            double calCardioTime = (cardioTime * 10) + calBurned;
            double calPullUps = pullUps*5;
            double finalCalBurned = calCardioTime + calPullUps ;

            System.out.println("Wow. You have burned " + calPullUps + " calories with pullups!"  );
            System.out.println("And you have burned " + calCardioTime + " calories with cardio! ");
            if(finalCalBurned>350){
                System.out.println("In total you have burned " + finalCalBurned + " calories! Good Job.");
            }else{
                System.out.println("In total you have burned " + finalCalBurned + " calories! Do better!.");
            }

        }else{
            double calPullUps = pullUps*5;

            System.out.println("Wow. You have burned " + calPullUps + " calories with pullups!"  );
            if (calPullUps>10){System.out.println("In total you have burned " + calPullUps + " calories! Good Job.");
            }else{
                System.out.println("In total you have burned " + calPullUps + " calories! Do better!.");
            }
        }
    scanner.close();
    }
}