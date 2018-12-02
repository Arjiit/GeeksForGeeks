import java.io.*;
import java.lang.*;
import java.util.*;

public class arraySubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while(t>0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];
			for (int i=0; i<n1; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int j=0; j<n2; j++) {
				arr2[j] = sc.nextInt();
			}
			compare(arr1,arr2);
			t--;
			
		}
	}
	
	public static void compare(int[] arr1, int[] arr2) {
		int count=0;
		boolean flag = true;
		for (int k=0; k<arr1.length;k++) {
			for (int l=0; l<arr2.length; l++) {
			if (arr1[k] == arr2[l]) {
				break;
			}
			else {
				count++;
				continue;
			}
			}
		if (count == arr2.length) {
			flag = false;
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
	
