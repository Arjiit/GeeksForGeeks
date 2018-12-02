import java.io.*;
import java.util.*;
import java.lang.*;

//O(n^4) 
public class fourSumNaive {
	public static void main(String[] args) {
	
		int A[] = {10, 20, 30, 40, 1, 2};
		int n = A.length;
		int X = 91;
		findFour(A, n, X);
	}
	
	public static void findFour(int[] A, int n, int X) {
	
		for (int i=0; i<n-3; i++) {
			for (int j = i+1; j<n-2; j++) {
				for (int k=j+1; k<n-1; k++) {
					for (int l=k+1; l<n; l++) {
						if (A[i] + A[j] + A[k] + A[l] == X)
							System.out.println(A[i] + " " + A[j]+ " " + A[k] + " " + A[l]);
					}
				}	
		}
			
	}
	}
}																																																																
