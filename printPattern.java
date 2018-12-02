import java.io.*;
import java.util.*;

public class printPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern pp = new printPattern();
		pp.print(n);
	}
	
	void print(int n) {
		if (n <= 1) {
			System.out.println("*");
		}
		else {
			for(int i=0; i<n; i++) {
				System.out.print("* ");
			}
			System.out.println();
			print(n-1);
		}
	}
	
}
