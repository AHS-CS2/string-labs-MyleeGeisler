//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 3 - 3 - 26
//Class - Computer Science I
//Lab  - String Checker

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		setString(" ");
	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   	word = s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c) != -1) 
		{
			return true;
		} else 
		{
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		if (word.indexOf(s) != -1)
		{
			return true;
		} else 
		{
			return false;
		}
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}