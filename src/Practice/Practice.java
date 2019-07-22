package Practice;

public class Practice {
	public static void main(String[] args) {
		String s="Aastha";
		String sb="Aasthaa";
		char [] ch= {'a','b','c'};
		s.copyValueOf(ch);
		System.out.println("Ends wiht method output "+s.endsWith("tha"));
		System.out.println("Method matches "+s.matches("(Aastha)"));
		int sum=0;
		int sum2=0;
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.codePointAt(i)+" ");
			sum+=s.codePointAt(i);
		}
		System.out.println();
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.codePointAt(i)+" ");
			sum2+=sb.codePointAt(i);
		}
		System.out.println();
		//System.out.println(sum+"  "+sum2);
		System.out.println(s.compareToIgnoreCase(sb));
		//System.out.println(s.codePointCount(0, 5));
		System.out.println(s.contentEquals("Aastha"));
	}
}
