import java.io.*;
import java.util.*;
import java.lang.*;

public class smallElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		getSmallElement(arr,n);
		}
	}
	
	public static void getSmallElement(int[] arr, int n) {
		for (int i=0; i<n-1; i++) {
			if (arr[i+1] < arr[i]) {
				System.out.print(arr[i+1] + " ");
			}
			else { System.out.print(-1 + " ");
			}
		}
		System.out.print(-1);
		System.out.println();
	}
}
