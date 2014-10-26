import java.util.Scanner;
public class Week4Lab1 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int guess;
		int computerNum = 0 + (int)(Math.random() * 10);
		
		System.out.println("Welcome to the Guess A Number Game!");
		
		System.out.println("Please enter your guess.");
		guess = input.nextInt();
		
		System.out.printf("The computer's number is %d.\n\n", computerNum);
		
		if(guess == computerNum)
		{
			System.out.println("You guessed right. You win!");
		}
		else if(guess < computerNum)
		{
			System.out.println("You lose! Too low.");
		}
		else
		{
			System.out.println("You lose! Too high.");
		}		
	}
}

