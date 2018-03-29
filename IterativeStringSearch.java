package IterativeStringSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IterativeStringSearch {
	private static String elements[] = {"Vaibhav","Yash","Manpreet","Yashul","Sumit","Garvit"};
	
	public static int iterativeStringSearch (String elemets[], String goal) {
		Arrays.sort(elements);
		int ndx = 0;
		while (ndx < elements.length && elements[ndx] !=(goal)) ndx++;
		if (ndx >= elements.length) return -1;
		if (goal.equals(elements[ndx])) return ndx;
		else return -1 ;
	}
	
	public static void main(String[] args) {
		String goal = "Garvit";
		int result = iterativeStringSearch(elements,goal);
		if (result<0)
			System.out.println("The goal could not find: " + goal);
		else
			System.out.println("The goal of " + goal + " was found at index: " + result);
	}
}