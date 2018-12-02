import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumIndex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			String s1 = br.readLine().trim();
			String s2 = br.readLine().trim();
			findIndex(s1,s2);
		}
	}
	
	public static void findIndex(String s1, String s2) {
		int c=0;
		int min = 100000; //since maximum length of string was given as 10^5 in the question.
		char c1 = 'a';
		for (int i=0; i<s2.length(); i++) {
			int k = s1.indexOf(s2.charAt(i));
			if (k==-1) {
			c++;
			}
			else { 
			if (k < min) {
			min = k;
			c1 = s2.charAt(i);
			}
			}
		}
		
		if (c == s2.length()) {
		System.out.println("No character present");
		}
		else {

		 System.out.println(c1);
		 }
	}
}
