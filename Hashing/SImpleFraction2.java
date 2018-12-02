import java.io.*;
import java.util.*;
import java.lang.*;


public class SImpleFraction2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			fraction(n,d);
		}
	}
	
	public static void fraction(int n, int d) {
		String result = "";
		if (n <0 ^ d<0) {
			result = result + "-";
		}
		long res = n/d;
		int num = Math.abs(n);
		int den = Math.abs(d);
		result = result + res;
		long rem = (num%den)*10;
		if (rem == 0) { 
			System.out.println(res);
		}
		
		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		result = result + ".";
		while (rem != 0) {
		 if (hm.containsKey(rem)) {
		 	int begin = hm.get(rem);
		 	System.out.println(result + "(" + res + ")");
		 	return;
		 
		 }
		 else {
			hm.put(rem, result.length());
			rem = (rem%den)*10;
			res = rem/den;
			//result = result + String.valueOf(res);
		 }
		 
		 }
		 
		
	}
}

