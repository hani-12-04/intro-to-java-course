package com.cbfacademy.cars;

public class Car {

// Creating private fields 
    
private String make;
private String model;
private String colour;
private Integer year;

    
    
// Creating constructors
    
 public Car(String make, String model, String colour, int year){
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.year = year;
    
}
    
// return the car make
        
public String getMake(){
    return this.make;
}
    
public String getModel(){
    return this.model;
}
    
public int getYear(){
    return this.year;
}

public String getColour(){
    return this.colour;
}
    
public void setColour(String colour){
    this.colour = colour; 
}

public String getDetails(){
    return "Car Details" + this.make + this.model + this.colour + this.year;
}

}


