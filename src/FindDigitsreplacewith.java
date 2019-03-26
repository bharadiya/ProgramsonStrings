
public class FindDigitsreplacewith {
	public static void main(String[] args) throws Exception
	{
		String name= "Hi Resonataia 1234 56";
		StringBuilder n = new StringBuilder(name);
		String digit ="0123456789";
         for(int i=0;i<n.length();i++){
        	 for(int j=0;j<digit.length();j++) {
        		 if(name.charAt(i)==digit.charAt(j)) {
        		  n.setCharAt(i,'X');
        		 }
        	 }
         }
         System.out.println(n);
	}
}
