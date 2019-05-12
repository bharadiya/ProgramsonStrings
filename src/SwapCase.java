
public class SwapCase {
	public static String swapCase(String t) {
	    t=t.replaceAll("([a-z])","");   
	    return t;       
	}
	
	public static void main(String[] args) {
		System.out.println(swapCase("heLLo"));
	}
}
