public class SeperatingwithSpaces {
	public static void main(String[] args) {
		// India country code is +91
		String s="IndiaIsMyCountry";
		//s=s.replaceAll("(India).*([+][0-9]{2}).+", "$1 country code is $2 ");
		s=s.replaceAll("([A-Z])"," $1");
		s=s.toLowerCase();
		s=s.trim();
		System.out.println(s);
	}
}
