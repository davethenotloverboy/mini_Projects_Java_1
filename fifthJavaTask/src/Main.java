import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> gradeBook = new HashMap<>();

        System.out.println("Hi and Welcome to the Simple Student Grade book Mini Project.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to list in the grade book? ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();

        for(int a = 0; a < studentCount; a++){
            System.out.println("Please input the name of the student. ");
            String studentName = scanner.nextLine();
            System.out.println("Input the grade of that student. ");
            int studentGrade = scanner.nextInt();
            scanner.nextLine();
            gradeBook.put(studentName,studentGrade);
            System.out.println("Student: "+ studentName+ " recorded. \n Next student.");
        }

        //System.out.println(gradeBook);
        /*
        for(int i = 0; i < gradeBook.size(); i++){
            System.out.println("Student name: "+gradeBook.get(key)+ "Grade: "+ gradeBook.get(value));
        }*/

        for(Map.Entry<String,Integer>entry : gradeBook.entrySet()){
            String studentName = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println("Student Name -  Grade" );
            System.out.println("  " + studentName + "   -    " + studentScore);
        }

    }
}