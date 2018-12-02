import java.util.*;
import java.lang.*;
import java.io.*;

//O(n2) approach -> consider sum of all subarrays and return length of longest subarray having sum 'k'.
//O(n)
public class SubArraySumK {
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0) {
			int n,k;
			n = sc.nextInt();
			k = sc.nextInt();
			int arr[] = new int[n];
			for (int l=0; l<n;l++) {
				arr[l] = sc.nextInt();
			}
			findsum(arr,k, n);
		}
	}
	
	public static void findsum(int[] arr, int k, int n) {
		int sum = 0;
		int maxLen = 0;
		Integer temp;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i=0; i<n; i++) {
			sum = sum + arr[i];
		if (sum == k) {
			maxLen = i+1;
		}	
		if (!hm.containsKey(arr[i])) {
			hm.put(sum,i);
		}
		temp = hm.get(sum - k);
		if (temp != null) {
			if (i - temp >maxLen) {
				maxLen = i - temp;
			}
		}
		
		}
		System.out.println(maxLen);
	}
}
