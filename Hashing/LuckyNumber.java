import java.util.*;
import java.lang.*;
import java.io.*;

public class LuckyNumber {
	
	public static void main (String[] args) {
		int T;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while (T>0) {
			String str = sc.next();
			lucky(str);
			T--;
			}
	}
	
	public static void lucky(String str) {
	
		int i,j,n = str.length();
		boolean temp = true;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (i=0; i<n; i++) {
			for(j=i;j<n;j++) {
			String p = str.substring(i,j+1);
			int q = findProduct(p);
			if (hs.contains(q)) {
				temp = false;
				break;
			}
			hs.add(q);
			}
		}
		if (temp)
			System.out.println("1");
		else
			System.out.println("0");
	}
	
	public static int findProduct(String p) {
		int k,product = 1;
		for  (k=0;k< p.length();k++) {
			int d = (int)p.charAt(k) - '0';
			product = product*d;
		}
		return product;
	}
}
		
