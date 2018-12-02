import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regex {
	public static void main(String[] args) {
		String input = "abc";
		String input2 = "1234";
		
		String regex = "[+-]?[0-9][0-9]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		if(m.find() && m.group().equals(input))
			System.out.println(input + "is valid integer number");
		else
			System.out.println(input + "is not a valid integer number");
			
		m = p.matcher(input2);
		
		if(m.find() && m.group().equals(input2))
			System.out.println(input2 + "is a valid number");
		else
			System.out.println(input2 + "is not a valid number");
	}
}