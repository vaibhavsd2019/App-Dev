package IterativeSearch;

public class IterativeSearch {
private static int data [] = {1,8,19,7,15,11,21,25};
public static int iterativeSearch (int d[], int g) {
	int ndx = 0;
	while (ndx< d.length && d[ndx] < g) ndx++;
	if (ndx >= d.length) return -1;
	if (g== d[ndx]) return ndx;
	else return -1;
}

public static void main(String[] args) {
	int goal = 19;
	int result = iterativeSearch(data,goal);
	if (result<0)
		System.out.println("The goal could not find:" + goal);
	else
		System.out.println("The goal of " + goal + " was found at index: " + result);
}
} 
