package org.launchcode.java.demos.java4python.methods;

/**
 * Created by genew on 5/8/2017.
 */
public class Max {

    public static void main(String[] args) {

        int[] listInt = {2, 7, 11, -2, 3, 1, 21};
        int maxVal = 0;

        for(int i=0; i < listInt.length; i++){
            if (listInt[i] > maxVal){
                maxVal = listInt[i];
            }
        }

        System.out.println(maxVal);
    }

}
