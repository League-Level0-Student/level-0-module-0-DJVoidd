package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		 
		JOptionPane.showMessageDialog(null, "Fight the dragon and take back the treasure!");
		
		// 1. Create some variables to hold health levels
		int healthLevels;
			// playerHealth to store your health - set it equal to 100
	int playerHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int attackStrength;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
int dragonAttack = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			String attack = JOptionPane.showInputDialog("Do you want to attack with a yell or a kick");
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
 if (attack.equals("ba")) {
	 playerAttack = ran.nextInt(Integer.MAX_VALUE);
 }
				// 4. If they typed in "yell":
 else if (attack.equals("kick")) {
	 playerAttack = ran.nextInt(25);
 }
	 else if (attack.equals("yell")) {
		 playerAttack = ran.nextInt(10);
	 }
 
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
					
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health
 dragonHealth -= playerAttack;
			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
	dragonAttack = ran.nextInt(35); 
				// 8. Subtract the dragon attack value from the player's health
playerHealth -= dragonAttack;
			// ASSESS THE DAMAGE
if (playerHealth < 1){
	playerLost();
}


				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
else if (dragonHealth < 1) {
	dragonLost();
}
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method

			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health. The dragon has" + dragonHealth + " health.");
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "You have been L bozo'd and have no treeasure");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "You cranked 90's on the dragon and are very epic");
		System.exit(0);   //This code ends the program
	}

}
