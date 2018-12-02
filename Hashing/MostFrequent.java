import java.util.*;
import java.lang.*;
import java.io.*;

public class MostFrequent {
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0) {
			int n = sc.nextInt();
			String s = br.readLine().trim();
			String tokens[] = s.split(" ");
			System.out.println(most(tokens,n));
			t--;
		}
	}
	
	public static String most(String arr[], int n) {
		String mostFreq ="";
		int mostFreqNo = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0; i<n; i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i],0);
			}
			hm.put(arr[i],hm.get(arr[i])+1);
		}
		
		for (Map.Entry<String, Integer> entry: hm.entrySet()) {
			if (entry.getValue() > mostFreqNo) {
				mostFreq = entry.getKey();
				mostFreqNo = entry.getValue();
			}
			else {
			continue;
			}
		}
		
		for (Map.Entry<String, Integer> entry: hm.entrySet()) {
			if (entry.getValue() == mostFreqNo) {
				if (entry.getKey().compareTo(mostFreq) < 0)
				mostFreq = entry.getKey();
			}
		}
	return mostFreq;
	}
}
