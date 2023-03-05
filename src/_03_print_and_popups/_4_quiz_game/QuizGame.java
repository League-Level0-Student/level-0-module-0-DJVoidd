package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String q1 = JOptionPane.showInputDialog("Am I Cool?");
				// 2.  Ask the user a question 
				if (q1.equals("yes")) {
				// 3.  Use an if statement to check if their answer is correct
				score +=1;
				JOptionPane.showMessageDialog(null, "Congratulations, you got it right!");
				}
				// 4.  if the user's answer was correct, add one to their score 
				else {
					score-=1;
					JOptionPane.showMessageDialog(null, "Oops, you got it wrong.");
				}
				String q2 = JOptionPane.showInputDialog("Am I cracked at Fortnite?");
				if (q2.equals("no")) {
					score+=1;
					JOptionPane.showMessageDialog(null, "Congratulations, you got it right!");
				}
				else {
					score-=1;
					JOptionPane.showMessageDialog(null, "Oops, you got it wrong.");
				}
				String q3 = JOptionPane.showInputDialog("Is my name Daen?");
				if (q3.equals("no")) {
					score+=1;
					JOptionPane.showMessageDialog(null, "Congratulations, you got it right!");
				}
				else {
					score-=1;
					JOptionPane.showMessageDialog(null, "Oops, you got it wrong.");
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				if (score > (0)) {
				JOptionPane.showMessageDialog(null, "Congratulations, you passed! Your score is "+score);
				}
				else {
					JOptionPane.showMessageDialog(null, "Oof, you failed. Your score is "+score);
				}
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
