
import java.util.Scanner;

public class numberguess{

	public static void main(String arg[])
	{
		
		Scanner sc = new Scanner(System.in);

		
		int n = 1 + (int)(100* Math.random());
        int K = 10;

		int i, guess;

		System.out.println("A number is chosen" + " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");
            guess = sc.nextInt();

	
			if (n == guess) {
				System.out.println("Yeah!"+ " You guessed the number.");
				break;
			}
			else if (n > guess&& i != K - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (n < guess && i != K - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println("You have exhausted"+ " K ");

			System.out.println("The number was " + n);
		}
	}
}    


	

