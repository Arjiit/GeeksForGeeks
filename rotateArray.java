import java.io.*;
import java.util.*;
import java.lang.*;

public class rotateArray {
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
		for (int i=0; i<d; i++) {
			arr = rotate(arr);
		}
		
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	}
	
	public static int[] rotate(int[] arr) {
		int temp = arr[0];
		int n = arr.length-1;
		for (int j=0; j<n; j++) {
			arr[j] = arr[j+1];
		}
		arr[n] = temp;
		return arr;
	}
}
