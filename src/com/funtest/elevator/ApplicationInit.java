package com.funtest.elevator;

import java.util.Random;

import com.funtest.elevator.elements.Passenger;
import com.funtest.math.Rand;

/**
 * <p>
 * Initializing class
 * </p>
 * @author NorthernSprint
 */
public class ApplicationInit {
	
	private static final int FLOORS = 10;

	/**
	 * Initializing method. 
	 * This method is the first method run on application startup.
	 * <p/>
	 * TODO: Initialize program window, and run {@link Application}
	 * @param args Array of arguments
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Super Special Elevator Sim!");
		
		Passenger p1 = new Passenger(FLOORS);
		Passenger p2 = new Passenger(FLOORS);
		
		System.out.println("Passenger 1 Destination: " + p1.getDestination());
		System.out.println("Passenger 1 Position:    " + p1.getPosition());
		
		Random rand = new Random();
		
		for (int i = 0; i <10; i++) {
//			p1.reset(FLOORS);
//			System.out.println("Passenger 1 Destination: " + p1.getDestination());
//			System.out.println("Passenger 1 Position:    " + p1.getPosition());
			
			System.out.println(rand.nextInt(100));
		}
		
		
		
		
		
		
		System.out.println("\n\nExiting Program.");
	}//End of method main

}//End of class ApplicationInit