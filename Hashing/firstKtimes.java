import java.util.*;
import java.io.*;
import java.lang.*;

public class firstKtimes {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = sc.nextInt();
		while (t>0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = br.readLine().trim();
		String tokens[] = s.split(" ");
		System.out.println(getFirstK(tokens, n, k));
		t--;
		}
	}
	
	public static int getFirstK(String arr[], int n, int k) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0; i<n; i++) {
			if(!hm.containsKey(arr[i])) {
			hm.put(arr[i],0);
			}
			hm.put(arr[i],hm.get(arr[i]) + 1);
		}
		int value = 0;
		for (int j=0; j<n; j++) {
			if(hm.get(arr[j]) == k) {
				return Integer.parseInt(arr[j]);
			}
			else {
				continue;
			}
		}
		
	return -1;
	}
	
}
	
		
	
