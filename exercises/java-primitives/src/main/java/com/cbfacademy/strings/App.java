package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);   
    }

    public static String format(String item, int quantity, double price) {
<<<<<<< HEAD
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
=======
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        throw new RuntimeException("Not implemented");
>>>>>>> aa9a8f7a9cdd6151bae5bb9bf1ca8923b5ba87de
    }
}
