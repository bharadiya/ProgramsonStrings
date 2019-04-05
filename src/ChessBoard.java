
public class ChessBoard {
	public static boolean chessBoardCellColor(String one, String two) {
		String[] a = one.split("");
		String[] b = two.split("");
		int x = Integer.parseInt(a[1]);
		int y = Integer.parseInt(b[1]);
		char c = 'A';
		int count = 0;
		int count2 = 0;
		for (c = 'A'; c <= 'H'; c++) {
			count++;
			if (a[0].equals(Character.toString(c))) {
				break;
			}
		}
		for (c = 'A'; c <= 'H'; c++) {
			count2++;
			if (b[0].equals(Character.toString(c))) {
				break;
			}
		}
		String colorone = "";
		String colortwo = "";
		if ((x + count) % 2 == 0) {
			colorone = "white";
		} else {
			colorone = "black";
		}
		if ((y + count2) % 2 == 0) {
			colortwo = "white";
		} else {
			colortwo = "black";
		}
		return colorone.equals(colortwo);
	}

	public static void main(String[] args) {
		System.out.println(chessBoardCellColor("D2", "D2"));
	}
}
