package Assignmens_3;

public class Q_6 {

	public static void main(String[] args) {
/*Question-6
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it 
takes to kill a person.
       Sample Output
             Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
 */
		int caffeInDrink=501;
		int NumDrinkLethal;
		if(10000%caffeInDrink==0) {
		NumDrinkLethal=10000/caffeInDrink;
		 }else {
			 
			 NumDrinkLethal=1+10000/caffeInDrink;
		 }
		
		System.out.println("It would take about "+NumDrinkLethal+" drinks for a lethal overdoes");
		
		
		
		
		
		
		
		
	}

}
