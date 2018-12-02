import java.util.*;
import java.lang.*;
import java.io.*;

public class checkIsogram {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine().trim();
		int n = Integer.parseInt(s1);
		for (int l=0;l<n;l++) {
			String s2 = br.readLine().trim();
			String tokens[] = s2.split("");
			System.out.println(checkIsogram(tokens, tokens.length));
			}
		}
		
	public static int checkIsogram(String arr[], int n) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0;i<n;i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i],0);
			}
			hm.put(arr[i],hm.get(arr[i]) + 1);
		}
			for (Map.Entry<String, Integer> entry: hm.entrySet()) {
				if (entry.getValue() > 1)
				{
					return 0;
				}
				
				else {
				
					continue;
				}
			}
			return 1;
	}
}
				
		
