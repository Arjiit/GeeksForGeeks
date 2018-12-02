import java.io.*;
import java.lang.*;
import java.util.*;

public class longestConsecutiveSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			find(arr,n);
		}
	}
	
	public static void find(int arr[], int n) {
	Arrays.sort(arr);
	for (int j=0; j<n-1; j++) {
		if ((arr[j+1] - arr[j]) != 1) {
			System.out.println(j+1);
			break;
		}
		else {
		continue;
		}
	}
	}
	
}

