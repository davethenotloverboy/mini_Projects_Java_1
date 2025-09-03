//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//this is me trying out different
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");


        int number = 4;
        double numero = 5.9;
        char letter = 'M';
        boolean isHuman = true;
        String word = "aluminum";

        //use of boolean
        if(isHuman){
            System.out.print("You are a human!\n");
        }

        System.out.println(word);
        System.out.println(number);
        System.out.println(letter);
        System.out.println(numero);

        System.out.println("if "+ word+" is " + isHuman+" " + " then you are human");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        System.out.println(numberOne);

        System.out.print("Are you happy? ");
        boolean answer = scanner.nextBoolean();
        if (answer) {
            System.out.print( "yes you are sad");
        }
        else{
            System.out.print("no, you are sad");
        }
        scanner.close();
    }

}

