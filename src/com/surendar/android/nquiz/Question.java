package com.surendar.android.nquiz;

import java.util.Random;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int generateRandomNumber(int min, int max)
	{
	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();
	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;	
	}
	
	public static int addTwoNumbers(int first, int second){
		 return first+second;	
	}
	
	
	

}
