
public class FirstCharCapital {

	public static String makeUpperFirstletter(String a) {
		String output = "";
		for (int j = 0; j < a.length(); j++) {
			if (j == 0)
				output = output + Character.toString(a.charAt(0)).toUpperCase();
			else {
				output = output + a.charAt(j);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Resonatia company is good";
		// expected o/p : Every word's first character should be capital eg.Java
		// Programming Is...
		str = str.toLowerCase();
		String[] arr = str.split("\\s");
		String finaloutput = "";
		for (int i = 0; i < arr.length; i++) {
			finaloutput = finaloutput + " " + makeUpperFirstletter(arr[i]);
		}
		System.out.print(finaloutput);
	}

}
