import java.io.*;
import java.util.*;

public class longestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        longestPalindromicSubstring lp = new longestPalindromicSubstring();
        while (t-->0) {
            String str = sc.next();
            lp.getSubstringDp(str);
        }
    }

    public int getSubstringDp(String str) {
        int n = str.length();
        boolean[][] isPal = new boolean[n][n];

        int maxLength = 1;


        for (int i=0; i<n; i++) { // all substrings of length 1 are palindrome.
            isPal[i][i] = true;
        }

        int start = 0;
        for (int i=0; i< n-1; i++) { // checking for substring of length 2
            if (str.charAt(i) == str.charAt(i+1)) {
                isPal[i][i+1] = true;
                start = i;
                 maxLength = 2;

            }
        }

        for (int k = 3; k <= n; k++){ // checking for substring of length more than 2.
            for (int i=0; i< n-k+1; i++) { // fixing starting index
                int j = i + k -1;
                if (isPal[i+1][j-1] == true && str.charAt(i) == str.charAt(j)) {
                    isPal[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.println("Longest substring is:");
        print(str, start, start + maxLength - 1);
        return maxLength;
    }

        static void print(String str, int low, int high) { 
        System.out.println(str.substring(low, high + 1)); 
    } 

}