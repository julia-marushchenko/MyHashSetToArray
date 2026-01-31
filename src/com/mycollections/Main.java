/**
 *  Java program to create an array from stream of HashSet<>.
 */

package com.mycollections;

import java.util.Arrays;
import java.util.HashSet;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating HashSet.
        HashSet<Double> mySet = new HashSet<>();

        // Adding elements to mySet.
        mySet.add(3.8);
        mySet.add(9.3);
        mySet.add(11.5);
        mySet.add(12.0);
        mySet.add(17.9);

        // Declaring an array.
        Double[] myArray = mySet.parallelStream().toArray(Double[]::new);

        // Printing cloned set to console.
        System.out.println("Newly created array: " + Arrays.toString(myArray));

    }
}