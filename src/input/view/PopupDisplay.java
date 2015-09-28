package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output.
 * @author snem8901
 * @version 1.0 9/24/2015
 */
public class PopupDisplay
{
	/**
	 * Provides a popup box for asking a question and allows the user to submit a text answer.
	 * Returns the user response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer to the supplied question.
	 */
	public String getAnswers(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		
		return answer;
		
	}
	
	/**
	 * Displays a popup window for the user to type into.
	 * @param input The text to be displayed.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
