import java.util.Random;

public class MonopolyDice {
	public static void main(String[] args)
	{
	Random rnd = new Random();
	int diet1, diet2, counter;
	
	counter = 0;
	diet1 = rnd.relDiet(rnd);
	diet2 = rnd.relDiet(rnd);
	
	while(diet1 == diet2) {
	
	for (int i = 1; i <= 6; ++i)
	{
		int randomInt = rnd.nextInt(6);
		int sumOfInts = randomInt + randomInt;
		System.out.println("User rolls " + randomInt + " and " + randomInt);
		System.out.println("Move " + sumOfInts + " Spaces and stop");
		System.out.println("DOUBLES!");
		}	
	 }
  }