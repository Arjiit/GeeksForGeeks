import java.io.*;
import java.util.regex.Pattern;

public class reverseWords {
	public static void main(String[] args) {
		String s1 = "Welcome to Geeks for Geeks";
		System.out.println(reverse(s1));
	}
	
	static String reverse(String str) {
		Pattern pattern = Pattern.compile("\\s");
		String[] temp = pattern.split(str); 
		System.out.println(temp.length);// splitting string with pattern and storing in temp array.
		String result = "";
		
		for (int i=0; i<temp.length; i++) {
			if (i == temp.length) {
				result = result + temp[i];
			}
			else {
				result = " " + temp[i] + result;
			}
		}
		return result;
	}
}