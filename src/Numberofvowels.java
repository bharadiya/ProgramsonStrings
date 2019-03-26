
public class Numberofvowels {
	public int vowels(String s)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' || s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
			count++;	
			}
		}
		return count;
	}
	public static void positions(String s)
	{
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' || s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				System.out.print(s.charAt(i)+" is at position number "+i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
			
		String p="myth";
		Numberofvowels a=new Numberofvowels();
		System.out.println(a.vowels(p));
		positions(p);
	}
}
