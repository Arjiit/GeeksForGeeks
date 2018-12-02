import java.io.*;
import java.util.*;

public class binaryString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.next();
            binaryString bs = new binaryString();
            System.out.println(bs.approach2(str,n));
        }
    }

    // public void count(String s, Integer n) {
    //     int count =0;
    //     for (int i=0; i<s.length();i++) {
    //         for (int j=i+1; j<s.length();j++) {
    //             if (s[i] == '1' && s[i] == s[j]) {
    //                 count++;
    //             }
    //         }
    //     }

    // }

 public int approach2(String s, Integer n) {
       int count = 0;
        for (int i=0; i< s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }
        return count*(count-1)/2;
    }
}