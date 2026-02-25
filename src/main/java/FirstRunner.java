//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 25 - 26
//Class - Computer Science I
//Lab  - Start and End

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());
		
		out.print("\n\n");

		//add more test cases	
		
		demo = new FirstAndLast("World");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());

		out.print("\n\n");

		demo = new FirstAndLast("JukeBox");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());
		
		out.print("\n\n");

		demo = new FirstAndLast("TCEA");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter ::() " + demo.getLast());

		out.print("\n\n");

		demo = new FirstAndLast("UIL");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());
	}
}