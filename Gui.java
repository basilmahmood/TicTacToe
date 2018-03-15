package tictactoe;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Gui extends JFrame {

	public Gui(int size) {
		super("Tic-Tac-Toe by Basil");
		setLayout(new GridLayout(size, size, 10, 10));

		Icon X = new ImageIcon(getClass().getResource("X.png"));
		Icon O = new ImageIcon(getClass().getResource("O.png"));
		Cell cell;

		Handler handler = new Handler();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				cell = new Cell(i, j);
				cell.setRolloverIcon(O);
				cell.addActionListener(handler);
				this.add(cell);
			}
		}

	}
}