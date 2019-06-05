import java.util.regex.Pattern;

public class IsIPV4Address {
	public static boolean isIPv4Address(String address) {
		/*
		 * return Pattern.compile(
		 * "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")
		 * .matcher(inputString).find();
		 */
		String[] s = address.split("\\.");
		int len = s.length;
		if (len != 4) {
			return false;
		}
		int[] k = new int[len];
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("") || Pattern.compile("[^0-9]").matcher(s[i]).find()) {
				return false;
			}
			try {
				k[i] = Integer.parseInt(s[i]);
			} catch (Exception e) {
				return false;
			}

			if (k[i] < 0 || k[i] > 255) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIPv4Address("2525515659565959562659859522595955.255.255.255"));
	}
}
