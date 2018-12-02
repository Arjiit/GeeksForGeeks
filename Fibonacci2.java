import java.util.*;
import java.io.*;


/* Java program for Tabulated version (bottom up)*/ 

public class Fibonacci2 {
    int fib(int n) {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i=2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        Fibonacci2 fb = new Fibonacci2();
        int n=9;
        System.out.println(fb.fib(n));
    }
}