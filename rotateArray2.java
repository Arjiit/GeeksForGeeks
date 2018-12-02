import java.io.*;
import java.util.*;
import java.lang.*;

public class rotateArray2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		rotate(arr,d);
	}
	sc.close();
	}
	
	public static void rotate(int[] arr, int d) {
		StringBuilder sb = new StringBuilder();
		for(int i=d; i<arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		for (int i=0; i<d; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString().trim());
	}
}
