
import java.util.*;
import java.lang.*;
import java.io.*;

public class uniqueNumbers2 {
    public static boolean unique(int a)
    {
        HashSet<Integer> set = new  HashSet<Integer>();
        while(a > 0)
        {
            if(set.contains(a % 10))
            {
                return false;
            }
            else
            {
                set.add(a % 10);
            }
            a = a/10;
        }
        return true;
    }
    public static void uniqueDigits(int a , int b)
    {
        for(int i = a ; i <= b ; i++)
        {
            if(unique(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0 ; i < T ; i++)
		{
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    uniqueDigits(a,b);
		}
	}
}
