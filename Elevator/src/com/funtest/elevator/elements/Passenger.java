package com.funtest.elevator.elements;

import com.funtest.math.Rand;

/**
 * 
 * @author NorthernSprint
 */
public class Passenger {

	private int destination;
	private int position;
	private int mFloors;

	/**
	 * 
	 * @param maxFloors Max number of floors
	 */
	public Passenger(int maxFloors) {
		mFloors = maxFloors;
		setDestination(Rand.getInt(mFloors));
		setPosition(Rand.getInt(mFloors));
		System.out.println("Passenger Constructed!");
	}
	
	public void reset(int maxFloors) {
		mFloors = maxFloors;
		setDestination(Rand.getInt(mFloors));
		setPosition(Rand.getInt(mFloors));
		System.out.println("Passenger Reset!");
	}
	
	public void reset() {
		setDestination(Rand.getInt(mFloors));
		setPosition(Rand.getInt(mFloors));
		System.out.println("Passenger Reset!");
	}
	
	public int getDestination() {
		return destination;
	}

	private void setDestination(int floor) {
		destination = floor;
	}

	public int getPosition() {
		return position;
	}

	private void setPosition(int floor) {
		position = floor;
	}
}
