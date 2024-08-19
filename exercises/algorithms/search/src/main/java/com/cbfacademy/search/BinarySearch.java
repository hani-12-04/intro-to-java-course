package com.cbfacademy.search;

/**
 * A class that implements the binary search algorithm.
 * The binary search algorithm works on sorted arrays by repeatedly dividing
 * the search interval in half.
 */
public class BinarySearch implements Search {

    /**
     * Searches for the target value in the given sorted array using binary search.
     * 
     * @param arr The sorted array in which to search for the target.
     * @param target The value to search for.
     * @return The index of the target if found, or -1 if not found.
     */
    
    public int search(int[] arr, int target) {
        // Initialise the low and high pointers
        int low = 0;
        int high = arr.length - 1;

        // Continue searching while the search interval is valid
        while (low <= high) {
            // Calculate the mid-point of the current search interval
            int mid = (low + high) / 2;

            // Check if the mid-point element is the target
            if (arr[mid] == target) {
                return mid; // Target found at the mid-point
            }
            // If the target is greater than the mid-point element,
            // narrow the search to the right half of the array
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // If the target is less than the mid-point element,
            // narrow the search to the left half of the array
            else {
                high = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }
}