import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regex2 {
	public static void main(String[] args) {
		String input = "Geeks for Geeks";
		String regex = "\\b[a-zA-Z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		while(m.find())
			System.out.println(m.group());
		System.out.println();
	}
}