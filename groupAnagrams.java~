import java.util.*;
import java.io.*;
import java.lang.*;

public class groupAnagrams {

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int l=0; l<t; l++) {
		int n = sc.nextInt();
		String s1 = br.readLine().trim();
		String arr[] = s1.split(" ");
		group(tokens,n);
	}
}

public static void group(String arr[], int n) {
	HashMap<String, Integer> hs = new HashMap<String, Integer>();
	String s1;
	int value;
	for (int i=0 ; i< n; i++) {
		char[] arrays1 = arr[i].toLowerCase().toCharArray();
		Arrays.sort(arrays1);
		s1 = Arrays.toString(arrays1);
		if(hs.containsKey(s1)) {
			value = hs.get(s1);
			hs.put(s1, hs.get(s1)+1);
		}
		else {
		hs.put(s1,1);
		}
	
	}
	
	for (Map.Entry<String, Integer> entry: hs.entrySet()) {
	
		System.out.println(entry.getValue()+ " ");
	}
}
}
