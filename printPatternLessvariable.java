import java.io.*;
import java.util.*;

public class printPatternLessvariable {
    public static void main(String[] args) {
        int n = 16;
        printPattern p = new printPattern();
        p.getPattern(n);
    }

    public void getPattern(int n) {
        
        if (n < = 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        getPattern(n - 5);
        System.out.print(n + " ");

    }
}