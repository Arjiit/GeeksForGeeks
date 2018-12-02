import java.util.*;
import java.lang.*;
import java.io.*;

public class SimpleFraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n, d;
			n = sc.nextInt();
			d = sc.nextInt();
			System.out.println(fraction(n,d));
		}
	
	}
	
	public static String fraction(int n, int d) {
		String result = "";
		
		if ((n < 0) ^ (d < 0)) { // xor ^ to get right sign in division
			result = result + "-";
		}
		
		int num = Math.abs(n);
		int den = Math.abs(d);
		
		long res = num/den;

		result = result + res;
		
		long rem = (num%den)*10;
		if(rem == 0) {
			return result;
		}
		
		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		result = result + ".";
		System.out.print("result " + result);
		while(rem != 0) {
			if (hm.containsKey(rem))
			{
				System.out.println("result begin " + rem + hm.get(rem));
				int begin = hm.get(rem);
				String part1 = result.substring(0,begin);
				String part2 = result.substring(begin, result.length());
				result = part1 + "(" + part2 + ")";
				return result;
			}
			
			else {
				
				System.out.println("result rem " + rem + result.length());
				hm.put(rem, result.length());
				res = rem/den;
				result = result + String.valueOf(res);
				rem = (rem%den)*10;
			}
		}
		return result;
	}
}
