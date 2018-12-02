import java.io.*;

// theta(log n)
class CountSetBits {
	public static void main(String[] args) {
		int i=9;
		System.out.println(countbi(i));
	}
	
	static int countbi(int i) {
		int count = 0;
		while (n > 0) {
			count = count + n & 1;
			n >>= 1;
		}
		return count;
	}
	
}