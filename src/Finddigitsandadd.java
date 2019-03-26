
public class Finddigitsandadd {
	public static void main(String[] args) {
		String str = "fjdkfj";
		String num = "0123456789";
		int con = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if (str.charAt(i) == num.charAt(j)) {
					int w = Character.getNumericValue(str.charAt(i));
					con = con + w;

				}

			}
		}
		System.out.println(con);
	}
}
