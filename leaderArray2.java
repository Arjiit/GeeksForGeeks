import java.io.*;
import java.util.*;
import java.lang.*;

public class leaderArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n  = sc.nextInt();
			int arr[] = new int[n];
			for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
			leaders(arr,n);
		}
		
	}
	
	public static void leaders(int[] arr, int n) {
		int leader = arr[n-1];
		System.out.print(leader + " ");
		for (int i=n -2; i> -1; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.print(arr[i] + " ");
			}
		}
	}
}
