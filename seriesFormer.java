import java.io.*;
import java.util.*;
import java.lang.*;

public class seriesFormer {
	public static void main(String[] args) {
		String s = "1-5, 8, 11-14, 18, 20, 26-29";
		expand(s);
	}
	
	static String[] split(String st) {
		int wc = countWords(st);
		String w[] = new String[wc];
		char[] c = st.toCharArray();
		int k=0;
		for (int i=0; i<c.length; i++) {
			String s ="";
			
			while ( i < c.length && c[i] != ' ') {
				s = s + c[i];
				i++;
			}
			
			if (s.length() != 0) {
				w[k] = s;
					k++;
			}
 		}
		return w;
	}
	
	static int countWords(String str) {
		int count = 0;
		for (int i=0; i<str.length; i++) {
			if (i == 0 && str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void expand(String s) {
		String p = s;
		String[] arr = p.split("\\-");
		String k = "";
		for (int i=0; i<arr.length; i++) {
			if (i != arr.length - 1) {
				String[] arr1 = arr[i].split(", ");
				String[] arr2 = arr[i + 1].split(", ");
                int a = Integer.parseInt(arr1[arr1.length - 1]); 
                int b = Integer.parseInt(arr2[0]); 
				for (int j = a + 1; j < b; j++) { 
                    arr[i] = arr[i] + ", " + j; 
                } 
			}
			if (k != "") 
				k = k + "," + arr[i];
			else
				k = k + arr[i];
		}
		
		System.out.println(k);
	}
	
	}
