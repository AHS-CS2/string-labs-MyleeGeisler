//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 27 - 26
//Class - Computer Science I
//Lab  - String Ripper

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		setString("Hello!");
	}

	public StringRipper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
		word = s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x, y);
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}