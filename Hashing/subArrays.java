import java.io.*;
import java.lang.*;
import java.util.*;

// brute force -> O(n3), efficient -> O(n).

public class subArrays {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	for (int i=0; i<5; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(printSub(arr));
	}
	
	public static long printSub(int arr[]) {
		long result=0;
		int n = arr.length;
		for (int i=0; i<arr.length; i++) {
			result = result + arr[i]*(i+1)*(n-i);
		}
		
		return result;
	}

}

