package W14D3;

import java.util.Scanner;

public class P2 {
static int day;
static int days;
static int week;


public static  void main(String args[])
{
	Scanner keyboard = new Scanner(System.in);
	day= keyboard.nextInt();
	if(day<7)
	{
		System.out.println(days+" Days");
	}
	else 
{
days=day%7;
week=day/7;
		System.out.println(week +" Weeks"+ " and " + days +" Days");	

}
	keyboard.close();
}
}