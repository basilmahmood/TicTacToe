package tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeApp {
	
	public static void main(String[] args){
		
		
		Prompt prompt = new Prompt();
		
		if(prompt.getGridSize() < 10){
			Gui app = new Gui(prompt.getGridSize());
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.setSize(350, 350);
			app.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(prompt, "Please enter a value less than 10");
		}
		
		
		
	}

}
