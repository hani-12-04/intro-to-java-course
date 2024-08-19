package com.cbfacademy.shapes;

public class Paint {
    private double coverage; // Coverage in square feet per gallon

    // Constructor
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Method to calculate the amount of paint needed
    public double getAmount(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null");
        }
        double area = shape.getArea();
        return area / coverage;
    }
}
    

