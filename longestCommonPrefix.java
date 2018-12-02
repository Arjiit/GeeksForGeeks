import java.util.*;
import java.io.*;
// find the longest prefix of str1 that is common in str2 as well.

public class longestCommonPrefix {
    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "dgeek";

        Char[] ch1 = str1.toCharArray();
        Char[] ch2 = str2.toCharArray();
        longestCommonPrefix lcp = new longestCommonPrefix();
        lcp.getCommon(ch1, ch2); 
    }

    public void getCommon(Char[] ch1, Char[] ch2) {
        int m = ch1.length;
        int n = ch2.length;

        int[][] t = new int[m][n];
        int max = 0;

        for (int i=0; i < m; i++) {
            for (int j=0; j< n; j++) {
                t[i][j] = 0;
            }
        }

        for (int i=1; i<=m;i++) {
            for (int j=1; j<=n;j++) {
                if (ch1[i] == ch2[j]) {
                    t[i][j] = t[i-1][j-1] + 1;

                if (max < t[i][j]) {
                    max = t[i][j];
                }

                } else {
                    t[i][j] = 0;
                }
            }
        }
     for (int i=0; i<=m;i++) {
         for (int j=0; j<=n;j++) {
             if (t[i][j] == max) {
                 System.out.print(t[]);
             }
             else {

             }
         }
     }   
    }
}