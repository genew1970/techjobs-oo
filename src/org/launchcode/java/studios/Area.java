package org.launchcode.java.studios;
import java.util.Scanner;
/**
 * Created by genew on 5/8/2017.
 */

// Area class
public class Area {
    public static boolean AnotherCalc(){
        String userChoice = "";
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        while (!valid){

            System.out.println("\nWould you like to perform another calculation?");
            userChoice = in.next();

            if(userChoice == "y" || userChoice == "n"){
                System.out.println("Please enter y or n.");
            } else {
                valid = true;
            }
        }

        if (userChoice == "y"){
            return true;
        } else {
            return false;
        }
    }

    // prints the output
    public static void AreaOutput(double areaAnswer){
        String message = "The srea is " + areaAnswer;
        for(int i = 0; i < message.length(); i++){
            System.out.print("=");
        }
        System.out.println("\n" + message);
    }

    // calculates the area with given values
    public static double CalcArea(double calcPi, double calcRadius){
        double area = calcPi * Math.pow(calcRadius, 2);
        return area;
    }

    //checks for positive numbers
    public static boolean ValidateInput(double userInput) {
        if (userInput < 0) {
            System.out.println("Negative values are invalid.\n");
            return false;
        } else {
            return true;
        }
    }

    //stores the valid user input
    public static double GetInput(){
        double getRadius = 0;
        boolean valid = false;
        //valid input loop
        while(!valid) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the radius of the circle: ");
            try {
                getRadius = in.nextDouble();
                valid = Area.ValidateInput(getRadius);
            } catch (Exception e){
                System.out.println("Please enter a numberic value\n");
            }//end try catch statement
        }//end while
        return getRadius;
    }

    //main
    public static void main(String[] args) {
        double pi = 3.14,
                radius;
        boolean another = false;

        while (!another) {
            // method calls
            radius = Area.GetInput();
            double answer = Area.CalcArea(pi, radius);
            Area.AreaOutput(answer);
            another = Area.AnotherCalc();
        }
    }
}
