package com.cbfacademy.cars;

public class Car {
    // Creating private fields     
    private String make;
    private String model;
    private String colour;
    private int year;
    
    // Creating constructors   
    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;       
    }     
    // getters for make        
    public String getMake(){
        return this.make;
    }
    // getter for model 
    public String getModel(){
        return this.model;
    }
    // getter for year   
    public int getYear(){
        return this.year;
    }
    // getter for colour
    public String getColour(){
        return this.colour;
    }
    // setter for colour   
    public void setColour(String colour){
        this.colour = colour; 
    }
    // method t get car details
    public String getDetails(){
        return "Car Details" + this.make + this.model + this.colour + this.year;
    }

}


