package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	// TODO Auto-generated method stub


	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int randomWholeNumber;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	randomWholeNumber = ran.nextInt(4);
		// 3. Print your variable to the console
	System.out.println(randomWholeNumber);
		// 4. Get the user to enter something that they think is awesome
	JOptionPane.showInputDialog("Enter something you think is awesome.");
		// 5. If your variable is  0
	if (randomWholeNumber == (0)){
			// -- tell the user whatever they entered is awesome!
		JOptionPane.showMessageDialog(null, "That is awesome!");
	}
		// 6. If your variable is  1
	else if (randomWholeNumber == (1)) {
		JOptionPane.showMessageDialog(null, "That is ok I guess.");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	else if (randomWholeNumber ==(2)) {
		JOptionPane.showMessageDialog(null, "That is boring. Do better.");
	}
			// -- tell the user whatever they entered is boring.
	else {
		JOptionPane.showMessageDialog(null, "Are you even trying?");
	}
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).
	
}
	}