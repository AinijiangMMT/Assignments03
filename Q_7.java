package Assignmens_3;

public class Q_7 {

	public static void main(String[] args) {
/*Question-7
Write a program that determines the change to be dispensed from a vending machine.
 An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100),
  and the machine accepts only a single dollar bill to pay for the item.
     Sample output
      Price in cents : 95
      Your change is 0 quarters, 0 dimes, and 1 nickles 
 */
		int price=55;
		int change =100-price;
		int NumQuarters=change/25;
		int NumDimes=(change-NumQuarters*25)/10;
		int NumNickles=(change-NumQuarters*25)%10;
		
		System.out.println("Your change is "+NumQuarters+" quarters, "+NumDimes+" dimes, and "+NumNickles+" nickles");
		
		
		
		
	}

}
