
public class FindspecialChars {
	public boolean hasVowel(String s) {
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (s.charAt(i) == vowels.charAt(j)) {
					return true;

				}
			}

		}
		return false;
	}
	public static void main(String[] args) {
		String str = "#$%^HGGhjh(*hh*&hhy^?";
//String comp = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		String []Output;
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < comp.length(); j++) {
//				if (str.charAt(i) == comp.charAt(j)) {
//					Output = Output + str.charAt(i);
//				}
//			}
//		}
		Output=str.split("\\w");
		for (String a : Output) {
			System.out.print(a);
		}
		
		//System.out.println(Output);

	}
}
