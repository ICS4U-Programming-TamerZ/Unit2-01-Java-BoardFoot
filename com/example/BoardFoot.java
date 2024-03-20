package com.example;

import java.util.Scanner;

/**
 * The BoardFoot class provides a method to calculate the length needed to make exactly 1 board foot of wood.
 * A board foot is defined as a piece of wood that is 12 inches wide by 12 inches long by 1 inch thick (144 cubic inches).
 * This program takes user input for the height and width of the object and calculates the length required to make 1 board foot.
 * 
 * @author Tamer
 * @version 1.0
 * @since 2024-03-20
 */
public final class BoardFoot {
    
    /**
     * CalculateBoardFoot method calculates the length required to make 1 board foot of wood.
     * It takes the height and width of the object as parameters.
     * 
     * @param height The height of the object in inches.
     * @param width The width of the object in inches.
     * @return The length required to make 1 board foot of wood.
     */
    public static float calculateBoardFoot(float height, float width) {
        final float VOLUME = 144f; // Volume of 1 board foot in cubic inches
        return VOLUME / (height * width); // Calculate the length
    }
    
    // Private constructor to prevent instantiation of the class
    private BoardFoot() {
        throw new UnsupportedOperationException("Cannot be instantiated.");
    }
    
    /**
     * The main method takes user input for the height and width of the object,
     * calculates the length required to make 1 board foot, and prints the result.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to read user input
        
        try {
            // Introduction to the program
            System.out.println("This program calculates the needed length of a BoardFoot in inches.");
            System.out.print("Please enter the height of your object: ");
            float userHeight = sc.nextFloat(); // Read user input for height
            System.out.print("Please enter the width of your object: ");
            float userWidth = sc.nextFloat(); // Read user input for width
            
            float length = calculateBoardFoot(userHeight, userWidth); // Calculate the length
            System.out.println("The needed length of a BoardFoot in inches is: " + length + " in");
        } catch (Exception e) {
            // Catch any exceptions that may occur during input/output operations
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            sc.close();
        }
    }
}
