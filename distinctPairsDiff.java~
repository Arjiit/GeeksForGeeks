import java.util.*;
import java.lang.*;
import java.io.*;

public class distinctPairsDiff {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0) {
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for (int i=0; i<n; i++){
		    	arr[i] = sc.nextInt();
		    }
		    int n1 = sc.nextInt();
		    System.out.println(print(arr, n, n1)); 
		    t--;   
		}
		
	}
	
	public static int print(int arr[], int n, int n1) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0; i<n; i++) {
		if(!hm.containsKey(arr[i])) {
			hm.put(arr[i], 0);
		}
		hm.put(arr[i], hm.get(arr[i])+1);
		}
		int count = 0;
		if (n1 == 0) {
			for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
				if (entry.getValue() > 1) {
					count++;
				}
			}
			return count;
		}
		else {
			for (int k=0; k<n-1;k++) {
				for (int l=k+1; l<n;l++) {
					if(Math.abs(arr[k] - arr[l]) == n1) {
						count++;
			}
			}
		}
		}
		return count;
	}
}
		
