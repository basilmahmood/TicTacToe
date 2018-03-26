package tictactoe;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Handler implements ActionListener{
	public void actionPerformed(ActionEvent event){
		Cell thiscell = (Cell)(event.getSource());
		Gui thisgui = thiscell.thisgui;
		thiscell.press();
		
		thisgui.game.switchplayer();
		thisgui.currentplayerLabel.setText("Current Player: " + String.valueOf(thisgui.game.getplayer()));
		thisgui.validate();
		JOptionPane.showMessageDialog(null, "It is now Player " + String.valueOf(thisgui.game.getplayer() + "'s Turn"));
	}

}
 