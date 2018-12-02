import java.io.*;
import java.lang.*;
import java.util.*;

public class distinctWindow {
	static final int MAX = 256;
	
	public static String findSubString(String str) {
		int n = str.length();
		int dist_count = 0;
		// counting all distinct characters.
		boolean[] visited = new boolean[MAX];
		Arrays.fill(visited, false);
		for (int i=0; i<n; i++) {
			if (visited[str.charAt(i)] == false) {
				visited[str.charAt(i)] = true;
				dist_count++;
			}
		}
		
		// maintaining window of characters containing all the characters of given string
		int start=0;
		int start_index =-1;
		int min_len = Integer.MAX_VALUE;
		int count = 0;
		int[] curr_count = new int[MAX];
		for (int j=0; j<n; j++)
		{
			// count occurences of characters of string
			
			curr_count[str.charAt(j)]++;
			if (curr_count[str.charAt(j)] == 1)
				count++; // if distinct character matched, increment the count.
			System.out.println(j + " " + count + " " + dist_count + " " +curr_count['a'] + " " + curr_count['b'] + " " + curr_count['c'] + " " + curr_count['d']);
			
			if (count == dist_count) // if all the characters are matched.
			{
	
				while(curr_count[str.charAt(start)] > 1) // trying to minimize the window i.e. repeat elements removing from starting and also removing useless characters.
				{
					if(curr_count[str.charAt(start)] > 1)
						curr_count[str.charAt(start)]--;
					start++;
					System.out.println(j + " " + start+ " " + str.charAt(start) + " " + curr_count[str.charAt(start)]);
				}
				int len_window = j - start + 1; // updating window size
				if (min_len > len_window)
				{
					min_len = len_window;
					start_index = start;
				}
			}
		}
	return str.substring(start_index, start_index+min_len);
	}
	
    public static void main(String args[])
    {
        String str = "aabcbcdbca";
        System.out.println("Smallest window containing all distinct"
               + " characters is " + findSubString(str));
    }
}
