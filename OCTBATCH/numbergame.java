import java.util.Random; 
import java.util.Scanner; 

public class numbergame { 
	public static void main(String[] args) 
	{ 

		int answer, guess; 
 
		final int MAX = 100; 

		Scanner input = new Scanner(System.in); 

		Random number = new Random(); 

		boolean correct = false; 

		answer = number.nextInt(MAX) + 1; 

		while (!correct) { 

			System.out.println("Guess a number between 1 to 100: "); 

			guess = input.nextInt(); 

			if (guess > answer) { 
				System.out.println("Too high, Please try again"); 
			} 
     		else if (guess < answer) { 
				System.out.println("Too low, Please try again"); 
			} 
			else { 

				System.out.println("Yes, you guess the right number"); 
            	correct = true; 
			} 
		} 
		System.exit(0); 
	} 
}

