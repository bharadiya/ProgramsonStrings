
public class ChessKnight {
	/*
	 * This code gives number of moves a knight can make in game of chess
	 * Provide String 
	 * For Example : H8
	 * output = 2
	 */
	
	public static int chessKnight(String cell) {
		int count = 0;
		cell = cell.toUpperCase();
		int a = cell.charAt(0);
		int b = cell.charAt(1);

		// x axis
		switch (a) {
		case 65:
			a = 1;
			break;
		case 66:
			a = 2;
			break;
		case 67:
			a = 3;
			break;
		case 68:
			a = 4;
			break;
		case 69:
			a = 5;
			break;
		case 70:
			a = 6;
			break;
		case 71:
			a = 7;
			break;
		case 72:
			a = 8;
			break;
		default:
			System.out.println("No Such Position");
			break;
		}

		// y axis
		switch (b) {
		case 49:
			b = 1;
			break;
		case 50:
			b = 2;
			break;
		case 51:
			b = 3;
			break;
		case 52:
			b = 4;
			break;
		case 53:
			b = 5;
			break;
		case 54:
			b = 6;
			break;
		case 55:
			b = 7;
			break;
		case 56:
			b = 8;
			break;
		default:
			System.out.println("No Such Position");
			break;
		}

		// Logic

		if (a + 2 <= 8 && a + 2 >= 1) {
			if (b + 1 <= 8 && b + 1 >= 1) {
				count++;
			}
			if (b - 1 <= 8 && b - 1 >= 1) {
				count++;
			}
		}

		if (a - 2 <= 8 && a - 2 >= 1) {
			if (b + 1 <= 8 && b + 1 >= 1) {
				count++;
			}
			if (b - 1 <= 8 && b - 1 >= 1) {
				count++;
			}
		}

		if (b + 2 <= 8 && b + 2 >= 1) {
			if (a + 1 <= 8 && a + 1 >= 1) {
				count++;
			}
			if (a - 1 <= 8 && a - 1 >= 1) {
				count++;
			}
		}

		if (b - 2 <= 8 && b - 2 >= 1) {
			if (a + 1 <= 8 && a + 1 >= 1) {
				count++;
			}
			if (a - 1 <= 8 && a - 1 >= 1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(chessKnight("c2"));
	}
}
