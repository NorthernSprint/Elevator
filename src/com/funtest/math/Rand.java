package com.funtest.math;


public class Rand {
	private static int intValue;
	private static long longValue;
	private static double doubleValue;
	
	public static int getInt(int max, int min) {
		intValue = (int)getLong(max, min);
		return  intValue;
	}
	
	public static int getInt(int max) {
		intValue = (int)getLong(max);
		return  intValue;
	}
	
	public static long getLong(long max, long min) {
		long range = max - min;
		longValue = Math.round(Math.random() * range + min);
		return  longValue;
	}
	
	public static long getLong(long max) {
		longValue = Math.round(Math.random() * max);
		return  longValue;
	}
	
	public static double getDouble(double max, double min) {
		double range = max - min;
		doubleValue = Math.random() * range + min;
		return  doubleValue;
	}
	
	public static double getDouble(double max) {
		doubleValue = Math.random() * max;
		return  doubleValue;
	}
}
