import java.io.*;
import java.lang.*;
import java.util.*;

public class distinctWindow2 {
	
	static final int max = 256;

	public static void main (String[] args) {
		String str = "aabcbcdbca";
		System.out.println(printSubstring(str));
	}
	
	public static String printSubstring(String str) {
		int n = str.length();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i=0; i<n; i++) {
		if (!hm.containsKey(str.charAt(i))) {
			hm.put(str.charAt(i),0);
		}
		hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
		}
		int count = hm.size();
		int[] char_count = new int[max];
		int dist_count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;
		int start_index =-1;
		// maintaining window
		for (int j=0; j<n; j++) {
			char_count[str.charAt(j)]++;
			if(char_count[str.charAt(j)] == 1) {
				dist_count++;
			}
			
			if (dist_count == count) {
				while(char_count[str.charAt(start)] > 1) {
					if (char_count[str.charAt(start)] > 1)
						char_count[str.charAt(start)]--;
					start++;
				}
			int window_len = j - start + 1;
			
			if (min_len > window_len) {
				min_len = window_len;
				start_index = start;
			}
			}
				
		}
	return str.substring(start_index, start_index + min_len);
	}
}
