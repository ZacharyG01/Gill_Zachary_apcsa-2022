//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int temp = (int)(Math.random() * 3);
		switch (temp) {
			case 0: compChoice = "P";
			break;
			case 1: compChoice = "R";
			break;
			case 2: compChoice = "S";
			break;
		}
	}

	public String determineWinner()
	{
		String winner = "";
		
		if (playChoice.equals(compChoice))
			return winner="!Draw Game!";
		if ((playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("P") && compChoice.equals("R")) || (playChoice.equals("S") && compChoice.equals("P")))
			return winner = "!Player wins <<" + playChoice + " Beats " + compChoice + ">>!";
		else
			return winner = "!Computer wins <<" + compChoice + " Beats " + playChoice + ">>!";
	}

	public String toString()
	{	
		return "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
	}
}