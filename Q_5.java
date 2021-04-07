package Assignmens_3;

public class Q_5 {

	public static void main(String[] args) {
/* Question-5
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds
-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result
       Sample Output:
       inputSecond is 3695
      1 hours, 1 minutes, and 35 seconds 
 */
		 int seconds=4576554;
		 int minutes, hours;
		 hours=seconds/3600;
		 minutes=(seconds-hours*3600)/60;
		 seconds =seconds%60;
		 System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" secods");
		 
		
		
		
	}

}
