import java.io.*;


// Brian Kernighan;s approach O(log n)
public class recursiveCountSetBits {
	public static void main(String[] args) {
		int n = 9;
		System.out.println(getset(9));
	}
	
	public static int getset(int n) {
		if (n == 0)
			return 0;
		else
			return 1 + getset(n & (n-1));
	}
}