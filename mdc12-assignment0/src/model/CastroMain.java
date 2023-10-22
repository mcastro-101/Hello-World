/*
 * TCSS 305 Autumn 2022
 * Assignment 0
 */
package model;

/**
 * This program displays some output about myself.
 * @author Michael Castro
 * @version 15 October 2022
 */
public final class CastroMain {
    
    private CastroMain() {
        
    }

    public static void main(final String[] theArgs) {
        System.out.println("Hello! My name is Michael Castro from CastroMain.");
        final Castro castro = new Castro();
        castro.printCastroInfo();

    }

}