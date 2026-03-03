//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 24 - 26
//Class - Computer Science I
//Lab  - Start and End

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
		out.println("word :: " + word);
	}

	public String getFirst()
	{
		String first = word.charAt(0) + " ";
		return first;
	}
	
	public String getLast()
	{
		String last = word.charAt(word.length() - 1) + " ";
		return last;
	}

 	public String toString()
 	{
 		String output = "word :: " + word;
 		return output;
	}
}