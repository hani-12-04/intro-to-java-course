package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }
    @Test
    @DisplayName("prints Fizz")
    public void testFizz(){
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Fizz", FizzBuzz.get(6));
    }
    @Test
    @DisplayName("prints Buzz")
    public void testBuzz(){
        assertEquals("Buzz", FizzBuzz.get(5));
        assertEquals("Buzz", FizzBuzz.get(10));
    }
    @Test
    @DisplayName("prints FizzBuzz")
    public void testFizzbuzz(){
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

}