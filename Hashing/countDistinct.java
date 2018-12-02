import java.io.*;
import java.util.*;
import java.lang.*;

public class countDistinct {

	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while (t>0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		number(arr, n, k);
		t--;
	}
	}
	
	public static void number(int arr[], int n, int k) {
		for(int i=0; i<k; i++) {
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for(int j=i; j<i+k; j++) {
				if (!hm.containsKey(arr[j])) {
					hm.put(arr[j],0);
				}
				hm.put(arr[j], hm.get(arr[j]) + 1);
			}
			int count=0;
			for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
				count++;
			}
			System.out.print(count);
		}
	}
}
		
				
