package controller;

import java.util.Scanner;

public class ThirdController
{
	public void start()
	{
		System.out.println("Pokimon");

		questions();

		moreInput();
	}

	private void questions()
	{

		System.out.println("Whaat's your favorite color?");
		Scanner inputScanner = new Scanner(System.in);

		String answer = inputScanner.nextLine();
		System.out.println(answer);

		/*System.out.println("What is the answer?");
		answer = inputScanner.nextLine();

		System.out.println(answer);

		System.out.println("What is the best type of food?");
		answer = inputScanner.next();

		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);

		System.out.println("What is your favorite show?");
		answer = inputScanner.nextLine();
		System.out.println(answer);*/

		//inputScanner.close();
		//Closed because I am still using the InputScanner from the keyboard and don't want errors.
	}

	private void moreInput()

	{
		Scanner textScanner; //This is a declaration of a Scanner variable.

		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.

		System.out.println("Type in your favorite number");

		int userNumber = textScanner.nextInt();

		System.out.println("Your favorite number is " + userNumber);

		System.out.println("Type in some more information");

		//Need to call nextLine() to consume the enter press after the call to .next, .nextInt, or .nextDouble
		textScanner.nextLine();

		//System.out.println("Big frac ");

		//double answer = textScanner.nextDouble();
		//System.out.println(answer);

		System.out.println("What is your favorite candy :D ");

		String answer = textScanner.nextLine();
		System.out.println("You said " + answer);

		textScanner.close();

	}

	public boolean validInt(String sample)
	{
		//Declares and initializes a boolean variable to false.
		boolean isValid = false;

		try
		{
			//Tries to convert the text to an integer.
			Integer.parseInt(sample);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number big boi!");
		}

		return isValid;
	}

	public boolean validDouble(String example)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException oops)
		{
			System.out.println("Only floating point values are accepted AKA a number with a . in it");
		}

		return true;
	}
}
