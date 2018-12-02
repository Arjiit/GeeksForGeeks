import java.io.*;
import java.lang.*;
import java.util.*;

public class windowContainingString {
	
	static final int max = 256;

	public static void main (String[] args) {
	String str = "this is a test string";
        String pat = "tist";
      
       System.out.print("Smallest window is :  " +
                        printSubstring(str, pat));
        System.out.println();
	}
	
	public static String printSubstring(String str, String pat) {
		int len1 = str.length();
		int len2 = pat.length();
		
		if (len1 < len2) {
			System.out.println("No such window exits");
			return "";
		}
		
		int hash_pat[] = new int[max];
		int hash_str[] = new int[max];
		
		for (int i=0; i<len2; i++) {
			hash_pat[pat.charAt(i)]++;
		}
		int start=0;
		int start_index=-1;
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		for (int j=0; j< len1; j++) {
			hash_str[str.charAt(j)]++;
			if (hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
				count++;
			// System.out.println(j + " " + count + " " + len2+ " " +hash_str['t'] + " " + hash_str['i'] + " " + hash_str['s']);
			
				
			if (count == len2)
			{
				while(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)] ==0)
					{
						if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
							hash_str[str.charAt(start)]--;
						start++;
						// System.out.println(j + " " + start+ " " + str.charAt(start) + " " + hash_str[str.charAt(start)]);
					}
					
				int len_window = j - start + 1;
				if (min > len_window) {
					min = len_window;
					start_index = start;
				}
			}
		}
		
		if (start_index == -1) {
			return "";
		}
	return str.substring(start_index, start_index + min);
	}
}	
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
							
						
						
						
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
