import java.io.*;
import java.lang.*;
import java.util.*;

public class arrayEqualOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while(t>0) {
			int n1 = sc.nextInt();
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n1];
			for (int i=0; i<n1; i++) {
				arr1[i] = sc.nextInt();
			}
						for (int i=0; i<n1; i++) {
				arr2[i] = sc.nextInt();
			}
			compare(arr1,arr2,n1);
			t--;
		}
	}
	
	public static void compare(int arr1[], int arr2[], int n) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag = true;
		
		for (int i=0; i<n;i++) {
			if (arr1[i] == arr2[i]) {
			continue;
			}
			else {
			flag = false;
			break;
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
		
