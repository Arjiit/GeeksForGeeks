import java.io.*;
import java.util.*;

public class longestPalindromicSubsequence {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println(getLength(str));
        
    }

    static int max(int x, int y) {
        return (x > y ? x:y);
    }

    static int getLength(String str) {
        int n = str.length();
        int i, j, cl;
        int L[][] = new int[n][n]; // creating a table to store results

        for (i=0; i<n; i++) { // strings of length 1 are palindrome of length 1
            L[i][i] = 1;
        }

        for (cl=2; cl <=n; cl++) { // cl is length of substring
            for (i=0; i<n-cl+1; i++) {
                j = i+cl-1;
                if (str.charAt(i) == str.charAt(j) && cl==2) {
                    L[i][j] = 2;
                }
                else if (str.charAt(i) == str.charAt(j)) {
                    L[i][j] = L[i+1][j-1] + 2;
                } else {
                    L[i][j] = max(L[i+1][j], L[i][j-1]);
                }
            }
        }
        return L[0][n-1];
    }
}