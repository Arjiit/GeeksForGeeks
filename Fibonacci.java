import java.util.*;
import java.io.*;


/* Java program for Memoized version (Top Down) */

public class Fibonacci {
    final int MAX = 100;
    final int NIL = -1;

    int lookup[] = new int[MAX];

  /* Function to initialize NIL values in lookup table */
    void_initialize() {
        for(int i=0; i< MAX; i++) {
            lookup[i] = NIL;
        }
    }

  /* function for nth Fibonacci number */

    int fib(int n) {
        if(lookup[n] == NIL) {
            if ( n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fib(n-1) + fib(n-2);
            } 
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        int n=40;
        fb.void_initialize();
        System.out.println(" Fibonacci number is: " + fb.fib(n));
    }
}