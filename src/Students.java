import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by genew on 5/11/2017.
 */
public class Students {
    public static void main(String[] args) {
        // initialize variables and array object
        String newStudent = "";
        int studentId = 0;
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> studentIds = new ArrayList<>();

        // enter student names
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please enter the student name (ENTER to quit):");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while (!newStudent.equals(""));

        // input the id for each student
        for (String student : students) {
            System.out.println("Please enter the student ID for " + student + ":");
            studentId = in.nextInt();
            studentIds.add(studentId);
        }

        // prints message and the student's name/id
        System.out.println("\nID\t\tStudent");
        for(int i = 0; i < 15; i++){
            System.out.print("=");
        }
        for(int i = 0; i < students.size(); i++){
            System.out.print("\n" + studentIds.get(i) + "\t\t" + students.get(i));
        }
    }
}