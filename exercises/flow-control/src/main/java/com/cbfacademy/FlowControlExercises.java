package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {   
        // create list to hold the results   
        List<String> result = new ArrayList<>();
        // creating loop through each number in the input list
        for (int i = 0; i < numbers.size(); i++){
            // check if divisible by both 3 & 5
            if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0){
                result.add("FizzBuzz");
            // check if divisible by 3
            } else if(numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            // check if divisble by 5
            } else if(numbers.get(i) % 5 == 0){
                result.add("Buzz");
            // if not divisble by 3 or 5, add the number itself to the result list
            } else {
                result.add(numbers.get(i).toString());
            }
        }
        return result;
    }

    public String whichMonth(Integer number) {
        // using a switch-case to map each number to a corresponding month
        switch (number) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "Noveber";
            case 12: return "December";
            default: return "Invalid month number"; // handling invalid inputs
        }
    }   

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // initialising sum of evens
        int SumOfEvens = 0;
        // intialising sum of odds 
        int sumOfOdds = 0; 
        // creating loop from 1 to 100
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0) { // checking if the number is even
                SumOfEvens += i; // add to sum of evens
            } else {
                sumOfOdds += i; // add to sum of odds
            }
        }

        //printing sums for debugging purposes
        System.out.println(SumOfEvens); // should print 2550
        System.out.println(sumOfOdds); // should pring 2500
        // creatig a map to hold the results
        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", SumOfEvens); // add sum of evens to the map
        result.put("SumOfOdds", sumOfOdds); // add sum of odds to the map

        return result;     
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // using collections.reverse() to reverse the order of elements in the list
        Collections.reverse(numbers);
        return numbers; // returning the reversed list
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}