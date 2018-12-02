import java.io.*;
import java.lang.*;
import java.util.*;

public class countElements {
	public static void main(String[] args)	{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t>0) {
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
		arr1[i] = sc.nextInt();
		}
		for(int j=0; j<n; j++) {
		arr2[j] = sc.nextInt();
		}
	getElements(arr1,arr2);
	t--;
	}
	}
	
	public static void getElements(int[] arr1, int[] arr2) {
		int count[] = new int[101];
		Arrays.fill(count, 0);
		int n = arr1.length;
		for (int i=0; i<n; i++) {
			count[arr2[i]]++;
		}
		
		for (int j=1; j<101; j++) {
			count[j] = count[j] + count[j-1];
		}
		
		for (int k=0; k<n-1; k++) {
			System.out.print(count[arr1[k]]+ ",");
		}
		System.out.print(count[arr1[n-1]]);
		System.out.println();
	}
}
							
