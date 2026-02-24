//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 20 - 26
//Class - Computer Science I
//Lab  - String Basics

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		out.println(demo.printFirst());
		out.println(demo.printLast());
		demo.add();
		out.println(demo);

		out.print("\n\n");

		demo.setStrings("jim","bob");
		out.println(demo.printFirst());
		out.println(demo.printLast());
		demo.add();
		out.println(demo);

		out.print("\n\n");

		//add more test case
		
		demo.setStrings("sally", "sue");
		out.println(demo.printFirst());
		out.println(demo.printLast());
		demo.add();
		out.println(demo);

		out.print("\n\n");

		demo.setStrings("computer", "science");
		out.println(demo.printFirst());
		out.println(demo.printLast());
		demo.add();
		out.println(demo);

		out.print("\n\n");

		demo.setStrings("uil", "contests");
		out.println(demo.printFirst());
		out.println(demo.printLast());
		demo.add();
		out.println(demo);
	}
}