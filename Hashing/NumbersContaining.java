import java.io.*;
import java.lang.*;
import java.util.*;

public class NumbersContaining {
	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t>0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		number(arr, n);
		t--;
	}
	}
	
	public static void number(int arr[], int n) {
		if (contains(arr, 1) || contains(arr, 2) || contains(arr, 3)) {
			System.out.println(1 + " ");
		if (contains(arr, 2))
			System.out.println(2 + " ");
		if (contains(arr, 3))
			System.out.println(3);
		} else {
			System.out.println(-1);
		}
	
	}
	
	public static boolean contains(int arr[], int n) {
		for (int k =0; k<arr.length; k++) {
			if(arr[k] == n) {
				return true;
			}
			else {
			continue;
			}
		}
	return false;
	}

}
		
