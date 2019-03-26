import java.util.regex.Pattern;

public class SeperatingwithCapital {
	/*
	 * public static String properRearranging(String value) { String s =
	 * "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; String temp = ""; for (int i = 0; i <
	 * value.length(); i++) { for (int j = 0; j < s.length(); j++) { if
	 * (value.charAt(i) == s.charAt(j)) { temp += " "; break; } } temp +=
	 * Character.toString(value.charAt(i)); }
	 * 
	 * return temp.trim().toLowerCase(); }
	 */
	public static void main(String[] args) {
		String str = "IndiaIsGreatIs'ntShe?";
		String[] res;
		res = str.split("(?=[A-Z])");
		for (String i : res) {
			i=i.toLowerCase();
			System.out.print(i+" ");
		}
		
//		String temp = "";
//		for (int i = 0; i < res.length; i++) {
//			if (Pattern.compile("[A-Z]").matcher(res[i]).find()) {
//				temp += " " + res[i];
//			} else {
//				temp += res[i];
//			}
//		}
//		temp = temp.trim().toLowerCase();
//		System.out.println(temp);
	}
}
