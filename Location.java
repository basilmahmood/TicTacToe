package tictactoe;

public class Location implements Comparable<Location> {

	private final int x;
	private final int y;

	public Location(int xval, int yval) {
		if ((xval < 1) || (yval < 1)) {
			throw new IllegalArgumentException("Bad Location");
		}
		this.x = xval;
		this.y = yval;
	}

	public Location(Location other) {
		this.x = other.x;
		this.y = other.y;
	}

	public boolean equals(Location other) {
		if ((this.x == other.x) && (this.y == other.y)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Location loc) {
		int result;
		if (this.x > loc.x) {
			result = 1;
		} else {
			if (this.y > loc.y) {
				result = 1;
			} else if (this.y == loc.y) {
				result = 0;
			} else {
				result = -1;
			}
		}

		return result;
	}

}
