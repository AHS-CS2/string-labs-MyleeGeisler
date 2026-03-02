//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 27 - 26
//Class - Computer Science I
//Lab  - String Name

import static java.lang.System.*;

public class Name
{
	private String name;
	private String first;
	private String last;
	private int spaceIndex;

	public Name()
	{
		setName("Timothy Smith");
	}

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
		name = s;
		spaceIndex = name.indexOf(" ");
   }

	public String getFirst()
	{
		first = name.substring(0, spaceIndex);
		return first;
	}

	public String getLast()
	{
		last = name.substring(spaceIndex + 1);
		return last;
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}