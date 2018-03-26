package tictactoe;

import java.awt.*;


import javax.swing.*;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	int currentplayer;
	Label currentplayerLabel;
	TicTacToe game;

	public Gui(int size) {
		super("Tic-Tac-Toe by Basil");
		game = new TicTacToe(size);
		
		this.setLayout(new BorderLayout());
		this.add(new Label("Tic Tac Toe by Basil"), BorderLayout.SOUTH);
		this.add(new TicTacToePanel(size, this), BorderLayout.CENTER);
		
		currentplayerLabel = new Label("Current Player: " + String.valueOf(game.getplayer()));
		this.add(currentplayerLabel, BorderLayout.NORTH);
		
		

	}
	
	
}