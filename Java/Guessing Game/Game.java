import java.util.Random;
import java.util.Scanner;

public class Game {

    // Min and Max values of number generated
    private int MIN;
    private int MAX;

    //The number in which to guess
    private int guessnumber = 0;
    //Total guesses taken
    private int guessestaken = 0;

    public Game(int min, int max) {
        MIN = min;
        MAX = max;

        //Assign a new random number to guessnumber
        guessnumber = generateNewNumber();
        int guess;
        do {
            guessestaken++;
            // Get the user input whilst guess is wrong
            guess = getUserInput();
            //Check user input
        } while (!checkUserGuess(guess));
    }

    // Gets an integer value from user
    private int getUserInput() {
        Scanner input = new Scanner(System.in);
        String userinput;
        do {
            System.out.print("Guess a number between "+ MIN +" and "+MAX+": ");
            // Make the user input a value while input is not an integer
            userinput = input.nextLine();
        } while (!isInteger(userinput));
        //Returns the input parsed as an integer
        return Integer.parseInt(userinput);
    }

    //Generate a new value between MIN and MAX
    private int generateNewNumber() {
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;
    }

    private boolean checkUserGuess(int guess) {
    	if (guess > MAX || guess < MIN){
    		System.out.println("Invalid range");
    	}
    	else{
		    if (guess == guessnumber) {
		        //If the user guesses right return true
		        System.out.println("Well done! " + guessnumber + " was my number! You guessed it in " + guessestaken + " guesses");
		        return true;
		    } else {
		        // Return false with appropriate output to console
		        if (guess > guessnumber) {
		            System.out.println("My number is less than " + guess + ".");
		            MAX = guess;
		        } else {
		            System.out.println("My number is greater than " + guess + ".");
		            MIN = guess;
		        }
		    }
		}
        return false;
    }

    //Returns true when input string is a valid integer
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
	
    public static void main(String args[]) {
        int lower = 0, upper = 100;
        String down;
        System.out.print("Enter lower bound [Default = 0] : ");
        Scanner in = new Scanner(System.in);
        down = in.nextLine();
        if(down != null && !down.isEmpty()){
        	lower = Integer.parseInt(down);
        }
        String up;
        System.out.print("Enter upper bound [Default = 100] : ");
        Scanner out = new Scanner(System.in);
        up = out.nextLine();
        if(up != null && !up.isEmpty()){
        	upper = Integer.parseInt(up);
        }
        
        new Game(lower, upper);
    }
}
