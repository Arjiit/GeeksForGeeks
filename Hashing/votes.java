import java.util.*;
import java.lang.*;
import java.io.*;

public class votes {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s1 = br.readLine().trim();
	int t = Integer.parseInt(s1);
	for (int l=0;l<t;l++) {
		String s2 = br.readLine().trim();
		int n = Integer.parseInt(s2);
		String s3 = br.readLine().trim();
		String tokens[] = s3.split("\\s+");
		System.out.println(mostFrequent(tokens, tokens.length));
		}
	}
	
	public static String mostFrequent(String arr[], int n) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
			for (int i=0;i<n;i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i],0);
				}
			hm.put(arr[i],hm.get(arr[i]) + 1);
			}
			int most =0;
			String frequent = "";
			for (Map.Entry<String, Integer> entry: hm.entrySet()) {
				if (entry.getValue() > most) {
				most = entry.getValue();
				frequent = entry.getKey();
				}
			}
			
			for (Map.Entry<String, Integer> entry: hm.entrySet()) {
				if (entry.getValue() == most) {
					if (entry.getKey().compareTo(frequent) < 0) {
						frequent = entry.getKey();
					}
				}
			}
			return frequent+ " "+most;
	}
}
					
					
					
					
