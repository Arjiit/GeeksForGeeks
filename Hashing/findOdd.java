import java.io.*;
import java.util.*;
import java.lang.*;

public class findOdd {
	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
		while (t>0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		number(arr, n);
		t--;
	}
	}
	
	public static void number(int arr[], int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i],0);
			}
			hm.put(arr[i], hm.get(arr[i]) +1);
		}
		for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			if(entry.getValue()%2 != 0) {
				System.out.print(entry.getKey());
			}
			else {
			continue;
			}
		}
	}
}
