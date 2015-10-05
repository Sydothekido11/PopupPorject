package input.controller;

import input.model.Thing;
import input.view.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
/**
 * Displays the windows necessary for the user to type in the information.
 * It also defends itself with if and else statements if the user types in info that is not valid for the required primitve.
 * 
 */
	public void start()
	{
		String name = myPopups.getAnswers("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswers("Type in your age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswers("Type in an integer value!");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswers("Type in your weight");
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswers("Give me a valid double value!");
		}
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -.9999999;
		}
		
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}
		/**
		 * Displays a window telling the user their information is not valid and then displays the user input window again.
		 */
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid integer.");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid double.");
		}
		
		return isDouble;
	}

	{
	
		
		
		
	}
}

