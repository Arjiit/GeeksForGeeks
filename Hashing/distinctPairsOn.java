
import java.util.*;
import java.lang.*;
import java.io.*;

class distinctPairsOn {
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		    int n=s.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		    }
		    int k=s.nextInt();
		    Arrays.sort(a);
		   int count=0;
		      int l,r = 0;
    while(r < n)
    {
        if(a[r] - a[l] == k && r!=l  )
        {
            count++;
            l++;
            r++;
        }
        else if(a[r] - a[l] > k)
            l++;
        else // arr[r] - arr[l] < sum
            r++;
    } 
		 if(a[0]==a[n-1]) 
		  count=1;
		    System.out.println(count);
		    t--;
		}
	}
}
