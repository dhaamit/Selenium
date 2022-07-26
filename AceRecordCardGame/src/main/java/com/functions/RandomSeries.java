package com.functions;


import java.util.LinkedHashSet;


public class RandomSeries {
	
	@SuppressWarnings("rawtypes")
	public LinkedHashSet generateRandomSeries(int min, int max) {
		LinkedHashSet <Integer> ar = new LinkedHashSet <Integer>();
			while (ar.size()<max)
			{
				ar.add(getRandomNumber(min, max));
			}
		return (LinkedHashSet) ar;
	}
	
	public int getRandomNumber(int min, int max)
	{
		int ran;
		ran = (int)(Math.random()*(max-min+1)+min);
		return ran;
	}
}
