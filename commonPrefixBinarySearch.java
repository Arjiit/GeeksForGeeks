import java.io.*;

public class commonPrefixBinarySearch {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        int n = arr.length;
        String ans = commonPrefix(arr, n);

        if(ans.length() > 0) {
            System.out.println("common prefix is: " + ans);
        }
        else {
            System.out.println("no common prefix");
        }
    }

    public static String commonPrefix(String arr[], int n) {
        int index = findMinLength(arr, n);
        String prefix = "";
        
        int low =0, high =index;
        while (low <= high) {
            int mid = (low + high)/2;

            if (allContainsPrefix(arr, n, arr[0], low, mid)) {
                prefix = prefix + arr[0].substring(low,mid+1);
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            
        }
        return prefix;
    }

    public static boolean allContainsPrefix(String arr[], int n, String str, int start, int end) {
        for (int i=0; i<n; i++) {
            String arr_i = arr[i];
            for (int j = start; j<=end; j++) {
                if (arr_i.charAt(j) != str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static int findMinLength(String arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr.length<min) {
                min = arr[i].length();
            }
            else {
                continue;
            }
        }
        return min;
    }
}