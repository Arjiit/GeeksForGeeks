
public class getUnique {

	static final int INT_SIZE = 32;
	public static void main(String[] args) {
		int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
		int n = arr.length;
		System.out.println(getSingle(arr, n));
	}
	
	public static int getSingle(int arr[], int n) {
		int result =0;
		int x, sum;
		for (int i=0; i<INT_SIZE, i++) {
			sum = 0;
			x = (1 << i);
			for (int j=0; j<n; j++) {
				if ((arr[j] & x) == 0)
					sum++;
			}
			if ((sum % 3) == 0)
				result |= x;
		}
		return result;
	}
}