//(c)  A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 2 - 20 - 26
//Class - Computer Science I
//Lab  - String Basics

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
    setStrings("hello", "world");
   }

   public AddStrings(String one, String two)
   {
    setStrings(one, two);
   }

   public void setStrings(String one, String two)
   {
      first = one;
      last = two;
   }

   public String printFirst()
   {
      String result1 = "first :: " + first;
      return result1;
   }

   public String printLast()
   {
      String result2 = "last :: " + last;
      return result2;
   }

 	public void add()
 	{
      sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output= "sum :: " + sum;
 		return output;
	}
}