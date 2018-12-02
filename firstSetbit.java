import java.io.*;
import java.util.*;

public class firstSetbit {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) {
		int n = sc.nextInt();
		getset(n);
	}
}
	public static void getset(int n) {
		for (int i=1<<31; i>=0; i=i/2) {
			if (i & n == 1) {
			System.out.print(i+1);
			break;
		}
	}
}