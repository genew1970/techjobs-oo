package org.launchcode.java.studios;

import java.util.HashMap;

/**
 * Created by genew on 5/11/2017.
 */
public class Occurances {
    public static void main(String[] args){
        // initializes hashmap, string value and places the string in a character array
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = myString.toCharArray();

        // iterates through the character array
        for(Character letter : charactersInString){
            // if the letter is already in the hashmap, it will add one to its counter value
            if(letters.containsKey(letter)){
                letters.put(letter, letters.get(letter) + 1);
            } else {
                // otherwise, a new occurance is entered into the hashmap
                letters.put(letter, 1);
            }
        }

        // iterates through each key in the hashmap, displaying the key and values
        letters.forEach((k,v)->System.out.println(k + ": " + v));

    }
}
