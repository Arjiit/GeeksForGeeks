import java.util.*;
import java.io.*;
import java.lang.*;

//O(n) approach
public class countSubarrayEqualNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test, m;
		int i,j = 0;
		test = sc.nextInt();
		
		while (test-->0) {
			m = sc.nextInt();
			int arr[] = new int[m];
			
			for(i=0; i<m; i++) {
				arr[i] = sc.nextInt();
			}
			total(arr);
		}
	}
	
	public static void total(int[] arr) {
		int sum =0;
		int n = arr.length;
		int i,j,k;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (i=0; i<n;i++) {
			if (arr[i] == 0) {
				sum = sum -1;
			}
			else {
				sum = sum + arr[i];
			}
				if (hm.containsKey(sum)) {
					hm.put(sum, hm.get(sum) + 1);
				}
				else {
					hm.put(sum,1);
				}
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			int freq = entry.getValue();
			count = count + (freq*(freq-1))/2;
		}
		if (hm.containsKey(0))
			count = count + hm.get(0);
		System.out.println(count);
	}
}
