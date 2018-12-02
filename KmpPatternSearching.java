import java.io.*;
import java.util.*;

// to find whether a string is substring on another string.
// O(n) time

public class KmpPatternSearching {
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        KmpPatternSearching kmp = new KmpPatternSearching();
        kmp.search(pat,txt);
    }

    void search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        int lps[] = new int[M];
        int j = 0; // index for pat

        computeLPSArray(pat, M, lps);

        int i =0; // index for txt

        while(i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j ==  M) {
                System.out.println("Found pattern at index: " + (i - j));
                j = lps[j - 1];
            }
            // mismatch after j matches
             else if (i< N && pat.charAt(j) != txt.charAt(i)) {
                 if (j != 0) {
                     j = lps[j-1];
                 } else {
                     i = i+1;
                 }
             }
        }

    }

    public void computeLPSArray(String pat, int M, int lps[]) {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++; // + 1 included due to this
                lps[i] = len;
                i++;
            }
            else { // if (pat[i] != pat[len])
                if (len != 0) {
                    len = lps[len - 1];

            } else { // if (len == 0)
                lps[i] = len;
                i++;
            }
        }

    }
}
}