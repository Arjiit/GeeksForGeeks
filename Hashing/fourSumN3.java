import java.io.*;
import java.util.*;
import java.lang.*;

//O(n^3) 
public class fourSumN3 {
	public static void main(String[] args) {
	
		int A[] = {10, 20, 30, 40, 1, 2};
		int n = A.length;
		int X = 91;
		findFour(A, n, X);
	}
	
	public static void findFour(int[] A, int n, int X) {
	
		int l, r;
		Arrays.sort(A);
		for (int i=0; i<n-3; i++) {
			for (int j = i+1; j<n-2; j++) { // fixing two elements and finding the other two
				l = j+1; // initializing remaining two variables as index of the first and last element.
				r = n-1;
				
				while (l<r) {
					if (A[i] + A[j] + A[l] + A[r] == X) {
						System.out.println(A[i] + " " + A[j]+ " " + A[l] + " " + A[r]);
						l++;
						r--;
					}
					else if (A[i] + A[j] + A[l] + A[r] < X)
						l++;
					else 
						r--; 
				}
		}
			
	}
	}
}																																																																
