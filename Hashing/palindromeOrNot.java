import java.io.*;
import java.util.*;
import java.lang.*;

public class palindromeOrNot {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			String s = br.readLine().trim();
			palindrome(s,n);
			t--;
		}
	}
	
	public static void palindrome(String s, int n) {	
		boolean flag = true;
		for (int i=0; i<n/2; i++) {
				if (s.charAt(i) == s.charAt(n-i-1)) {
					continue;
				}
				else {
				flag = false;
				}
		}
		
		if(flag) {
			System.out.println("YES");
			}
			else {
			System.out.println("NO");
			}
	}
}
