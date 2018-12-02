import java.io.*;
import java.lang.*;
import java.util.*;

public class longestConsecutiveSubsequenceHashing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(find(arr,n));
		}
	}
	
	public static int find(int arr[], int n) {
		HashSet<Integer> S = new HashSet<Integer>();
		int ans = 0;
		
		for (int i=0; i<n; i++) {
			S.add(arr[i]);
		}
		
		for (int i=0; i<n; i++) {
			if (!S.contains(arr[i] - 1)) {
				int j = arr[i];
				while (S.contains(j)) {
					j++;
					
					if (ans < j - arr[i]) 
						ans = j - arr[i];
				}
			}
		
		}
	return ans;
	}
	
}

