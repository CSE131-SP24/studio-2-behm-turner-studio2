package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	System.out.println("Whats your start amount?");
	int startAmount = in.nextInt();
	System.out.println("Whats your win chance? Must be between 0 and 1.");
	double winChance = in.nextDouble ();
	System.out.println("Whats your win limit?");
	int winLimit = in.nextInt ();
	double computer = (Math.random());
	double win = (winChance * computer);
	
	while (startAmount < winLimit && startAmount>0){
		if (0 < win && win<0.5)
		{
			startAmount++; 
			System.out.println("LOSE: " + startAmount);
		}
		else
		{
			startAmount--;
			System.out.println("WIN: " + startAmount);
		}
			
	if (startAmount == 0)
		System.out.println("You've hit ruin");
	if (startAmount == winLimit)
	System.out.println("You've won");
	}
		

}
}