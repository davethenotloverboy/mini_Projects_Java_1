import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi and Welcome to the Unit Converter App!");
        Scanner scanner = new Scanner(System.in);
        boolean taskFinished = false;
        do {
            System.out.println("What would you like to do? Choose the number of your choice:  ");
            System.out.println("1. Temperature    2. Weight");
            int userChoiceOne = scanner.nextInt();
            if (userChoiceOne == 1) {
                System.out.println("1. F to C   or   2. C to F");
                int userChoiceTwo = scanner.nextInt();
                if (userChoiceTwo == 1) {
                    System.out.println("Input the Temperature in Fahrenheit: ");
                    double userTemp = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The temperature in celsius is "+ ((userTemp - 32)*0.555) + (" celsius."));
                    System.out.println("Compute another one? yes/no: ");
                    String userAnswer = scanner.nextLine();
                    if (userAnswer.equalsIgnoreCase("yes")){
                        taskFinished = false;
                    }else {
                        taskFinished = true;
                        break;
                    }
                }else if (userChoiceTwo == 2){
                    System.out.println("Input the temperature in Celsius: ");
                    double userTemp = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The temperature in Fahrenheit is "+ ((userTemp*1.8)+32)+" fahrenheit");
                    System.out.println("Compute another one? yes/no");
                    String userAnswer = scanner.nextLine();
                    if (userAnswer.equalsIgnoreCase("yes")){
                        taskFinished = false;
                    }else {
                        taskFinished = true;
                        break;
                    }
                }else{
                    System.out.print("Invalid Input");
                    taskFinished = false;
                }

            } else if (userChoiceOne == 2) {
                System.out.println("1. Kg to lb    or    2. Lb to Kg");
                int userChoiceTwo = scanner.nextInt();
                if (userChoiceTwo == 1){
                    System.out.println("Input the Kg: ");
                    double userWeight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(userWeight + "kg in lbs is " + (userWeight*2.20462) +" in pounds");
                    System.out.println("Compute another one? yes/no");
                    String userAnswer = scanner.nextLine();
                    if (userAnswer.equalsIgnoreCase("yes")){
                        taskFinished = false;
                    }else {
                        taskFinished = true;
                        break;
                    }
                } else if(userChoiceTwo == 2){
                    System.out.println("Input the Lbs: ");
                    double userWeight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The answer is " + userWeight/2.20462);
                    System.out.println("Compute another one? yes/no");
                    String userAnswer = scanner.nextLine();
                    if(userAnswer.equalsIgnoreCase("yes")){
                        taskFinished = false;
                    }else{
                        taskFinished = true;
                        break;
                    }
                }else{
                    System.out.print("Invalid Input");
                    taskFinished = false;
                }
            }
        }while(!taskFinished);
        System.out.print("Have a Good day!");
        scanner.close();
    }
}