package studio2;

import java.util.Scanner;

public class Pi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	double dartThrowX = Math.random ();
	double dartThrowY = Math.random ();
	System.out.println("Dart coordinates: " + dartThrowX + "," + dartThrowY);
	//Origin is 0,0 ; r=1
	double distance = Math.sqrt((dartThrowX)*(dartThrowX)*100/100.00+ (dartThrowY)*(dartThrowY));
	System.out.println ("Dart distance: " + distance);
int count = 0;
while (count<500) {

if (distance < 1)
	System.out.println ("this is within the circle");
	else
		System.out.println ("this is not within the circle");
count ++;
}
	}
}
