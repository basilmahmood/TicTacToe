package tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prompt extends JFrame {
	
	private int gridsize;
	
	public Prompt(){
		
		String str = JOptionPane.showInputDialog("Please input grid size: ");
		
		gridsize = Integer.valueOf(str);
		
	}
	
	
	public int getGridSize(){
		return gridsize;
	}
	
	
	
	
}
