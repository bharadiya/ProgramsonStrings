import java.util.regex.Pattern;

public class ReverseParenthisis {

	public static String doReversal(String a) {
		String res = "";
		a = a.substring(1, a.length() - 1);
		for (int i = a.length() - 1; i >= 0; i--) {
			res += a.charAt(i);
		}
		return res;
	}
	
	/**
	 * @category String Reversal 
	 * @author Shashank
	 * @param Any Input String
	 * @return reveres the input string where brackets () are given
	 */
	public static String reverseInParentheses(String i) {
		String patterns = "";
		int temp = 0;
		if (Pattern.compile("[^\\w]").matcher(i).find()) {
			for (int j = 0; j < i.length(); j++) {
				if (i.charAt(j) == ')') {
					temp = j;
					for (int k = j; k >= 0; k--) {
						if (i.charAt(k) == '(') {
							patterns = i.substring(k, temp + 1);
							i = i.replace(patterns, doReversal(patterns));
							break;
						}
					}
					break;
				}
			}
		}
		// Exit Condition
		else {
			return i;
		}
		return reverseInParentheses(i);
	}

	public static void main(String[] args) {
		System.out.println(reverseInParentheses("(pa(hi)ka)"));
	}
}
