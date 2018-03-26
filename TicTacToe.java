package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TicTacToe {
	private int currentplayer;
	private int boardsize;
	private List<Location> XBoard;
	private List<Location> OBoard;
	private List<ArrayList<Location>> wincombos;

	public TicTacToe(int size) {
		this.currentplayer = 1;
		this.boardsize = size;
		wincombos = new ArrayList<ArrayList<Location>>();
		XBoard = new ArrayList<Location>();
		OBoard = new ArrayList<Location>();
		this.generateWins();
	}

	public void generateWins() {
		for (int i = 1; i <= boardsize; i++) {
			ArrayList<Location> list1 = new ArrayList<Location>();
			ArrayList<Location> list2 = new ArrayList<Location>();
			for (int j = 1; j <= boardsize; j++) {
				list1.add(new Location(i, j));
				list2.add(new Location(j, i));
			}

			this.wincombos.add(list1);
			this.wincombos.add(list2);

		}
	}

	public boolean checkIfWon() {
		boolean result = true;
		if (this.currentplayer == 1) {
			Collections.sort(OBoard);
			for (int i = 0; i <= boardsize - 1; i++) {
				List<Location> list = new ArrayList<Location>();
				list.addAll(wincombos.get(i));
				Collections.sort(list);

				if (OBoard.size() == list.size()) {
					for (int j = 0; j <= OBoard.size() - 1; j++) {
						if (!(list.get(j).equals(OBoard.get(j)))) {
							result = false;
						}

					}
				} else {
					result = false;
				}
			}
		}

		else {
			Collections.sort(XBoard);
			for (int i = 0; i <= boardsize - 1; i++) {
				List<Location> list = new ArrayList<Location>();
				list.addAll(wincombos.get(i));
				Collections.sort(list);

				if (XBoard.size() == list.size()) {
					for (int j = 0; j <= XBoard.size() - 1; j++) {
						if (!(list.get(j).equals(XBoard.get(j)))) {
							result = false;
						}
					}
				} else {
					result = false;
				}
			}
		}

		return result;
	}

	public void switchplayer() {
		if (this.currentplayer == 1) {
			this.currentplayer = 2;
		} else {
			this.currentplayer = 1;
		}
	}

	public void addXBoard(Location loc) {
		XBoard.add(loc);
	}

	public void addOBoard(Location loc) {
		OBoard.add(loc);
	}

	public int getplayer() {
		return currentplayer;
	}

}
