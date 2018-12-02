import java.util.*;
import java.lang.*;
import java.io.*;

public class uniqueNumbers {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0) {
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    print(n1,n2);    
		}
	}
	
	public static void print(int n1, int n2) {
		for (int i=n1; i<n2+1; i++) {
			String str = Integer.toString(i); // converting integer to string
			int n = str.valueOf(i).length(); // getting length of string containing integer
			if (str.charAt(0) == str.charAt(n-1)) {
				continue;
			}
			else {
				System.out.print(i+ " ");
			}
		}
	}
}

 
	
