package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cell extends JButton {
	
	Location loc; 
	Icon X = new ImageIcon(getClass().getResource("X.png"));
	Icon O = new ImageIcon(getClass().getResource("O.png"));
	
	public Cell(int xval, int yval){
		this.loc = new Location(xval, yval);
	}
	
	public void setCell(int currentplayer){
		if(currentplayer == 1){
			this.setIcon(X);
			
		}
		else if(currentplayer == 2){
			this.setIcon(O);
		}
	}
	public void getCell(int currentplayer){
		
	}
	

}
