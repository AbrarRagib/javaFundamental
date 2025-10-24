// package com.example.geometry; //

import java.lang.Math;      // 2. Imports

/**
 * Represents a rectangle shape.
 */
public class Rectangle {    // 3. Class Declaration

    // --- 4. Fields ---
    private double length;
    private double width;

    // --- 5. Constructor ---
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // --- 6. Methods ---
    public double calculateArea() {
        return this.length * this.width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);
        System.out.println("Area: " + rect.calculateArea());
    }
}

//TEST`