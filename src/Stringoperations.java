
public class Stringoperations {
	public static void main(String[] args) {
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String s = new String(c);
		// Character array Constructer to create a string
		String b = new String(c, 1, 4);
		// Character arrayConstructer to create a string from specific characters
		String p = new String(b);
		// Constructor for creating a String from a string
		System.out.println(p);
		System.out.println(s);
		System.out.println(b);

		// Constructer:StringBuffer
		String str = "Hello";
		str.concat(str);
		System.out.println(str);
		// StringBuffer objects are mutable while String are immutable
		// 2 Principal Methods a.append();b insert();
		 
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Testing Shastra");
		System.out.print("String buffer output is "+sb);
	
		// Constructer:Stringbuilder
		
	}
}
