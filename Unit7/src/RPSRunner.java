//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		boolean playing = true;
		//add in a do while loop after you get the basics up and running
		while (playing == true) { 
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			out.print(game);
			out.println("\n Do you want to play again? [Y,N] :: ");
			player = keyboard.next();
			if (player.equals("Y") != true)
				playing = false;
		}
	}
}



