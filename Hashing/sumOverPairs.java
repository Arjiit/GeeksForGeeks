import java.util.*;
import java.lang.*;
import java.io.*;

public class sumOverPairs {

	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = sc.nextInt();
	while(T>0) {
		int n = sc.nextInt();
		String b = br.readLine().trim();
		String tokens[] = b.split(" ");
		System.out.println(sum(tokens,n));
		T--;
	}
	}
	
	public static int sum(String str[], int n) {
	int sum = 0;
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j< n; j++) {
				if ((Integer.parseInt(str[j]) - Integer.parseInt(str[i]) > 1) ||(Integer.parseInt(str[i]) - Integer.parseInt(str[j]) > 1)) {
				int temp = Integer.parseInt(str[j]) - Integer.parseInt(str[i]);
				sum = sum + temp;
				}
				else {
				 continue;
				 }
			}
		}
	return sum;
	}
}
