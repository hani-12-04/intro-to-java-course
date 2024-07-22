package com.cbfacademy.search;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {

        int[] array = new int[100]; // size of array is 100
        int target = 42; // target value is 42

        for(int i = 0; i <array.length; i++) {
            array[i] = i;

        }
        
        // int index = Arrays.binarySeach(array, target); this is the bult-in binary search method of arrays
        int index = binarySearch(array, target);

        if(index == -1) { // if our index is equal to -1
            System.out.println(target + " not found");        
        }

        else {
            System.out.println("Element found at: " + index);
        }

    }

        private static int binarySearch(int[] array, int target) {

            int low = 0; // begining of the index 
            int high = array.length - 1; // ending of our index

            while(low <= high) {

                int middle = low + (high - low) / 2; // middle index
                int value = array[middle]; // extract that value found within array[middle]

                System.out.println("middle: " + value);
                
                if(value < target) low = middle + 1;
                    else if (value > target) high = middle - 1;
                    else return middle; // target found

            }

            return -1; // target not found
                                

        }
    
}