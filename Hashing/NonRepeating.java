import java.util.*;
import java.lang.*;
import java.io.*;

public class NonRepeating {

	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = sc.nextInt();
		for (int l=0; l<n;l++) {
			int n1 = sc.nextInt();
			String str = br.readLine().trim();
			String tokens[] = str.split(" ");
			System.out.println(repeat(tokens, n1));
		}
	}
	
	public static int repeat(String arr[], int n) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0; i<n;i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i],0);
			}
			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		String result="";
		
		for (Map.Entry<String, Integer> entry: hm.entrySet()) {
			if (entry.getValue() == 1) {
				return Integer.parseInt(entry.getKey());
			}
			else {
				continue;
			}
		}
	
	return 0;
	}
}
		
