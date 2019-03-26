
public class Reverse {
	public static String reversal(String a)
	{
		String A="";
		for (int i = a.length()-1; i >=0; i--) {
			A=A+a.charAt(i);
		}
		return A;
	}
	
	public static void main(String[] args) {
		String word="Hello World";
		//expected output : iH I ma a emosewa remmargorp
		String[] output=word.split("\\s");
		String required="";
		for (int i = 0; i < output.length; i++) {
			required=required+" "+ reversal(output[i]);
		}
		System.out.print(required);
	}
}
