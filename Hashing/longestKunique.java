import java.io.*;
import java.lang.*;
import java.util.*;

public class longestKunique {

	static final int max = 256;
	
	public static void main(String[] args) {
		String s = "aabacbebebe";
		System.out.println(getString(s,3));
	}
	
	public static int getString(String str, int k) {
		if (k==0 || str == null || str.length() == 0) {
			return 0;
		}
		if (str.length() < k) {
			return str.length();
		}
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int maxLen = k;
		int start = 0;
		for (int i=0; i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),0);
			}
			hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
		
		if (hm.size() > k) {
		
			while(hm.size() > k) {
				if (hm.get(str.charAt(start)) == 1) {
					hm.remove(str.charAt(start));
				} else {
					hm.put(str.charAt(start), hm.get(str.charAt(start)) - 1);
				}
				start++;
			}
		}
	}
	maxLen = Math.max(maxLen, str.length() - start);
	
	return maxLen;
	}
}
			
			
