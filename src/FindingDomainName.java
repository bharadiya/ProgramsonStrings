import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingDomainName {
	public static String findEmailDomain(String address) {
		Pattern p = Pattern.compile("[p]");
		Matcher m = p.matcher(address);
		m.find();
		return address;
	}

	public static void main(String[] args) {
		findEmailDomain("prettyandsimple@example.com");
	}
}
