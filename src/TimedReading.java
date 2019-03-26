
public class TimedReading {
public static int timedReading(int maxLength, String text) {
		int c=0;
		text=text.replaceAll("[^\\p{L}\\p{Nd}]+", " ");
	    String []group=text.split("\\s");
	    for(int i=0;i<group.length;i++)
	    {
	        if(group[i].length()<=3)
	        	c++;
	    }
	    return c;
	}
	
public static void main(String[] args) {
	System.out.println(timedReading(3,"The Fox asked the stork, 'How is the soup?'"));
}
}
