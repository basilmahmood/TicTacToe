package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Cell extends JButton {
	
	Location loc; 
	Gui thisgui;
	Icon X = new ImageIcon(getClass().getResource("X.png"));
	Icon O = new ImageIcon(getClass().getResource("O.png"));
	
	public Cell(int xval, int yval, Gui thisgui){
		this.loc = new Location(xval, yval);
		this.thisgui = thisgui;
		
	}
	
	public void press(){
		if (thisgui.game.getplayer() == 1){
			this.setIcon(O);
			this.setEnabled(false);
			thisgui.game.addOBoard(loc);
			
		}
		else if (thisgui.game.getplayer() == 2){
			this.setIcon(X);
			this.setEnabled(false);
			thisgui.game.addXBoard(loc);
		}
		
		if(thisgui.game.checkIfWon()){
			JOptionPane.showMessageDialog(null, String.valueOf(thisgui.game.getplayer() + " has won!"));
			System.exit(0);
		}
		
	}
	public Gui getGui(){
		return this.thisgui;
	}

}
