package StringBuffers;
/*
 * String buffer has 4 constructors
 * 
 * 1.StringBuffer()
 * 2.StringBuffer(Charsequence seq)
 * 3.StringBuffer(int capacity)
 * 4.StringBuffer(String str)
 * 
 * 
 */
public class Practice {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		s.append("Shashank");
		System.out.println(s.append(true));
		System.out.println(s.delete(8,s.length()));
		System.out.println(s.deleteCharAt(s.length()-1));
		System.out.println(s.indexOf("z"));
//		s.append("shashankshashanks");
//		StringBuffer sb=new StringBuffer("shashank");
//		System.out.println(s.capacity());
//		s.append("abc");
//		System.out.println(s.capacity());
//		System.out.println("Append boolean "+ s.append(true));
//		System.out.println(s.reverse());
	}
}
