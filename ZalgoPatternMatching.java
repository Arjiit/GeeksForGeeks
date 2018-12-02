import java.io.*;
import java.util.*;

public class ZalgoPatternMatching {
    public static void main(String[] args) {
        String text= "aaabcxyzaaaabczaaczabbaaaaaabc";
        String pattern = "aaabc";
        List<Integer> result = ZalgoPatternMatching.matchPattern(text.toCharArray(), pattern.toCharArray());
        for (int i=0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public List<Integer> matchPattern(char text[], char pattern[]) {
        char[] newString = new char[text.length + pattern.length + 1];
        int i=0;
        for (char ch: pattern) {
            newString[i] = ch;
            i++;
        }
        newString[i] = '$';
        i++;
        for (char ch: text) {
            newString[i] = ch;
            i++;
        }
        List<Integer> result = new ArrayList<>();
        int Z[] = calculateZ(newString);

        for (int i=0; i<Z.length; i++) {
            if (Z[i] == pattern.length) {
                result.add(i - pattern.length - 1);
            }
        }
        return result;
    }

    private int[] calculateZ(char[] input) {
        int Z[] = new int[input.length];

        int left =0;
        int 




    }
}