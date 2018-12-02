import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.Point;

//O(n^2) solution
public class fourSumOptimal {
	public static void main(String[] args) {
	
		int A[] = {10, 20, 30, 40, 1, 2};
		int n = A.length;
		int X = 91;
		findFour(A, n, X);
	}
	
	public static int findFour(int[] arr, int n, int X) {
	
	HashMap<Integer, Point> hm = new HashMap<>();
	// hm will store sum of all possible pair combinations
	for (int i=0; i<n;i++) {
		for (int j=i+1; j<n;j++) {
			int rest = X - arr[i] - arr[j];
			System.out.println(rest);
		if (hm.containsKey(rest)) {
			Point point = hm.get(rest);
			System.out.println("elements: " + arr[i] + " " + arr[j] + " " + arr[point.x] + " " + arr[point.y]);
			return 1;
		}
		}
	// putting in hashmap all possible sums a[i] + a[k] where k<i	
	for (int k=0; k<i; k++) {
		hm.put(arr[i] + arr[k], new Point(i,k));
		System.out.println("value" + arr[i] + arr[k]);
	}
	}
	return 0;
	}
}																																																																
