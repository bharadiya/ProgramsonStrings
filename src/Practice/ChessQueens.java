package Practice;

public class ChessQueens {
//	String w indicates white queen position 
//	String b indicates black queen position

	public static boolean areQueensAttacking(String w, String b) {
		int[] x = getCordinates(w);
		int[] y = getCordinates(b);
		return (Math.abs(x[0] - x[1]) == Math.abs(y[0] - y[1])) || (x[0] != y[0] && x[1] == y[1])
				|| (x[0] == y[0] && x[1] != y[1]);
	}

	/*
	 * This function returns the geometrical coordinates of queen position.
	 */
	public static int[] getCordinates(String queenPosition) {
		int[] coordinates = new int[2];
		switch (queenPosition.charAt(0)) {
		case 'A':
			coordinates[0] = 1;
			break;
		case 'B':
			coordinates[0] = 2;
			break;
		case 'C':
			coordinates[0] = 3;
			break;
		case 'D':
			coordinates[0] = 4;
			break;
		case 'E':
			coordinates[0] = 5;
			break;
		case 'F':
			coordinates[0] = 6;
			break;
		case 'G':
			coordinates[0] = 7;
			break;
		case 'H':
			coordinates[0] = 8;
			break;
		}

		queenPosition = queenPosition.substring(1);
		coordinates[1] = Integer.parseInt(queenPosition);
		return coordinates;
	}

	public static void main(String[] args) {
		System.out.println(areQueensAttacking("A1", "D3"));
	}
}
