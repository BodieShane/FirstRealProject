package input.controler;

import java.util.Scanner;

public class InputController
{
	//Declaration section for instance variables
	//Data members are always private.
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	public void start()
	{
		questions();
		questions();
	}
	private void questions()
	{
		System.out.println(" Please type in your name");
		String myInput;
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello there " + myInput + ", do you like plums?");
		System.out.println("Did you type more then one name? I am sorry, I can't let you don that, Please type your full name");
		String fullName = inputScanner.nextLine();
		System.out.println("your full name is: " + fullName);
		System.out.println("My name is Java");
		System.out.println("How old are you?");
		int age= inputScanner.nextInt();
		System.out.println("You are " + age + " years old? I need to kill all " + age + " year old " + fullName + "'s where do you live?" );
		inputScanner.nextLine();
		String live = inputScanner .nextInt();
		System.out.println(" Thankyou I will go to " + live + " now");
	}
}
	