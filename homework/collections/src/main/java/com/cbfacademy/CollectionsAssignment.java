package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while(iterator.hasPrevious()){
            int value = iterator.previous(); //acess the previous element
            if(value < minValue) {
                iterator.remove(); // removes any valyes less tan minValue
            }

        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        //Using HashSet to track the unique elements
        Set<Integer> uniqueElements = new HashSet<>(integers);

        //if the size of the set is less than the size of the collection, there are duplicates
        return uniqueElements.size() < integers.size();
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        // Using a TreeSet to automatically sort an remove duplicates
        Set<Integer> resultSet = new TreeSet<>(ints1);
        resultSet.addAll(ints2); // adding all elements from the second collection
        return new ArrayList<>(resultSet);
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        //Using TreeSet to automatically sort the elements
        Set<Integer> resultSet = new TreeSet<>(ints1);

        resultSet.retainAll(ints2);
        return new ArrayList<>(resultSet); //converting to set to an ArrayList
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        if (list.isEmpty()) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        return ""; //returning an empty string if the list is empty
        }
        Map<String, Integer> frequencyMap= new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        String mostFrequentString = null;
        int maxCount =0;

        for (Map.Entry<String, Integer> entry: frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentString = entry.getKey();
            }
        }
        return mostFrequentString;
    }
    public static String getName() {
         return "Collections Assignment";
    }
}