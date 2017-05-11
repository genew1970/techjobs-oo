import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by genew on 5/10/2017.
 */
public class SumEven {
    // sums the number in the for loop.  only even numbers are added to the sum
    public static int SumArray(ArrayList<Integer> numArray){
        int sum = 0;
        for(int i = 0; i < numArray.size(); i++){
            if(numArray.get(i) % 2 == 0){
                sum += numArray.get(i);
            }
        }
        return sum;
    }
    // main method
    public static void main(String[] args){
        // initialize variable and arraylist
        int answer = 0;
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(21, 22, 11, 33, 44, 66, 55, 33, 99, 88));

        // calls method passing the array list and prints the output
        answer = SumEven.SumArray(myArray);
        System.out.println(answer);
    }
}
