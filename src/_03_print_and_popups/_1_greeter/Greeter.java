package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {

	String input = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+input);
}
}