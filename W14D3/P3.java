package W14D3;

import java.util.Scanner;

public class P3 {
static String name;
static String family;
static String middle;
static String given;

public static void main(String args[]) {
	
Scanner keyboard = new Scanner(System.in);	
given=keyboard.nextLine();
middle=keyboard.nextLine();
family=keyboard.nextLine();

if(!family.equals(""))
{
	if(given.equals("") && middle.equals("")) 
		  System.out.println(family);
	else if(given.equals("")) 
		if(middle.equals(""))
			System.out.println(family );
		else
			System.out.println(family + ", " + middle);
	
	else if(middle.equals("")) 
		if(given.equals(""))
			System.out.println(family + ", ");
		else
		System.out.println(family + ", " + given);

	else 
		System.out.println(family + ", "+given+ " " + middle);
}
keyboard.close();
}
}

