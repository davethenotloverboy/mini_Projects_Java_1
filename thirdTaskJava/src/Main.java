import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Input your Full Name: ");
        String fullName = scanner.nextLine();

        scanner.close();

        char firstLet = fullName.charAt(0);
        String nameUp = fullName.toUpperCase();
        boolean hasSpace = fullName.contains(" ");
        String nameFull = fullName.strip().replaceAll("\\s+","");
        int charLen = nameFull.length();

        System.out.println("Hi "+fullName+ "!");
        System.out.println("Your name starts with letter "+firstLet);
        System.out.println("Your name in uppercases: "+nameUp);

        if(hasSpace){
            System.out.println("Your name has a space.");
            System.out.println("You have a "+charLen+" letter name!");
        }else{
            System.out.println("That's not your full name!");
            System.out.println("You have a "+charLen+" letter name!");
        }

    }
}