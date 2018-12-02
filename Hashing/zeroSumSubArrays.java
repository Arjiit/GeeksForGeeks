ximport java.util.*;
import java.io.*;
import java.lang.*;

public class zeroSumSubArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test, m;
		int i,j = 0;
		test = sc.nextInt();
		
		while (t-->0) {
			m = sc.nextInt();
			int arr[] = new int[m];
			
			for(i=0; i<m; i++) {
				arr[i] = sc.nextInt();
			}
			int count=0;
			for (i=0; i<m; i++) {
				int sum=0;
				for (j=i, j<m; j++) {
					sum = sum+ arr[j];
					if (sum ==0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
