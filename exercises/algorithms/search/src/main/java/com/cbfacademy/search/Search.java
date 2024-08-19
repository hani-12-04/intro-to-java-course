package com.cbfacademy.search;

public interface Search {
    /**
     * An interface defining the contract for search algorithms.
     * Implementing classes should provide a method to search for a target value
     * within an array.
     */
    /**
     * Searches an array.
     *
     * @param sortedArray The array to be searched (the array must be sorted)
     * @param target      The value being searched for
     * @return The array index of the target value, or -1 if the value is not found
     */
    int search(int[] sortedArray, int target);
}
