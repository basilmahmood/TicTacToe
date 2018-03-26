package tictactoe;

import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TicTacToePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public TicTacToePanel(int size, Gui thisgui) {
		setLayout(new GridLayout(size, size, 10, 10));

		Icon X = new ImageIcon(getClass().getResource("X.png"));
		Icon O = new ImageIcon(getClass().getResource("O.png"));
		Cell cell;

		Handler handler = new Handler();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				cell = new Cell(i, j, thisgui);
				cell.addActionListener(handler);
				this.add(cell);
			}
		}

	}
}
