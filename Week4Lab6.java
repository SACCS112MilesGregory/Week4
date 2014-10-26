import java.util.Scanner;

public class Week4Lab6 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int guess;
		int computerNum = 0 + (int)(Math.random() * 10);
		int count = 0;
		
		System.out.println("Welcome to the Guess A Number Game!");
		
		do
		{
			// Prompt the user
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
			} count++;
		}while(count<4); // allow the user to play 3 times
			System.out.print("Bye!");
	}
}

