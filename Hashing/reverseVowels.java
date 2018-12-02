import java.io.*;
import java.util.*;
import java.lang.*;

public class reverseVowels {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while(t>0) {
			String s = br.readLine().trim();
			reverse(s);
			t--;
		}
	}
	
	public static void reverse(String s) {
		List<Character> a = new ArrayList<Character>();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				a.add(s.charAt(i));
			}
		}
		
		int x = a.size()-1;
		char ch[] = s.toCharArray();
		for(int j=0; j<ch.length; j++) {
			if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
				ch[j] = a.get(x);
				x--;
			}
		System.out.print(ch[j]);
		}
		System.out.println();
	}
}
