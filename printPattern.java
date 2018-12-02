import java.io.*;
import java.util.*;

public class printPattern {
    public static void main(String[] args) {
        int n = 16;
        printPattern p = new printPattern();
        p.getPattern(n,n, true);
    }

    public void getPattern(int n, int m, boolean flag) {
        
        System.out.print(m + " ");

        if (n == m && flag == false) {
            return;
        }
        if (flag) {

            if (m - 5 > 0) {
                getPattern(n, m - 5, true);
            } else {
                getPattern(n, m-5, false);
            }
            
            
        } else {
            getPattern(n, m+5, false);
        }
    }
}