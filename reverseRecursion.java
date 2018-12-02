import java.io.*;

public class reverseRecursion {
	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		reverseRecursion rec = new reverseRecursion();
		rec.reverse(str);
	}
	
	void reverse(String str) {
		if (str.length() <= 1 || (str == null))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}	
	}
}
