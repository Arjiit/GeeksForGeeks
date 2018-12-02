import java.io.*;
import java.util.*;

public class Main {
    public static void longestCommonSubstring(String[] args) {
    
        char str1[] = "GEEKSFORGEEKS".toCharArray();
        char str2[] = "GEEKSQUIZ".toCharArray(); // ['G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z']
        
        int m = str1.length;
        int n = str2.length;
        longestCommonSubstring lcs = new longestCommonSubstring();
        System.out.println("Length of longest common substring: " + lcs.longestCommonSubstring(str1, str2));
        
    }

    public int longestCommonDP(char str1[], char str2[]) {
        
        int T[][] = new int[str1.length + 1][str2.length + 1];

        int max =0;
        for (int i=0; i <= str1.length; i++) {
            for (int j=0; j <= str2.length; j++) {
                
                if (i == 0 || j == 0) {
                    T[i][j] = 0;
                }

                if (str1[i-1] == str2[j-1]) {
                    T[i][j] = T[i-1][j-1] + 1;

                    if (max < T[i][j]) {
                        max = T[i][j];
                    }
                }
            }
        }
    return max;
    }
    
}