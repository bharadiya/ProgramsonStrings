
public class Reversethewords {
	public static void main(String[] args) {
		String word="I (am) a proud Indian";
		word=word.replace("(am)","Abhishek");
		System.out.println(word);
		//Expected output : Indian proud a am I
		String[] newone=word.split(" ");
		String convertedword="";
		for (int i = newone.length-1; i >= 0; i--) {
			convertedword+=newone[i]+" ";
		}
		System.out.println(convertedword);
	}
}
