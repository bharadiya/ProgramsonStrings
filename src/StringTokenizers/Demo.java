package StringTokenizers;

import java.util.StringTokenizer;

public class Demo {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("My hdsfhidsj , jdsfjkds  name , is Shashank",",",false);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}	
