import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by genew on 5/10/2017.
 */
public class StringArrays {
    // method finds string length values of 5
    public static void FindWords(ArrayList<String> wordArray){
        int goodWords = 0;

        for(String word : wordArray){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }
    // main method
    public static void main(String[] args){
        // initialize arraylist
        ArrayList<String> myArray = new ArrayList<>(Arrays.asList("hello", "hi", "yo", "java is fun", "nope", "isFun", "because I say so"));

        // calls method passing the array list and prints the output
        StringArrays.FindWords(myArray);
    }
}