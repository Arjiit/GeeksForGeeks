import java.io.*;
import java.lang.*;
import java.util.*;

public class arrayContiguos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while(t>0) {
			int n1 = sc.nextInt();
			int[] arr1 = new int[n1];
			for (int i=0; i<n1; i++) {
				arr1[i] = sc.nextInt();
			}
			compare(arr1,n1);
			t--;
			
		}
	}
	
	public static void compare(int[] arr1, int n) {
		Arrays.sort(arr1);
		boolean flag = true;
		for (int i=0; i<n-1; i++) {
				if (arr1[i+1] - arr1[i] > 1) {
				flag = false;
				break;
				}
				else {
					continue;
				} 
		}
		if (flag) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}	
	
