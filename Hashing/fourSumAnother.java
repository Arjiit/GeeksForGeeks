
import java.util.*;
import java.lang.*;
import java.io.*;

class fourSumAnother {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int ai=0;ai<t;ai++)
		{
		    int n=sc.nextInt();
		    int kt=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		     {
		         arr[i]=sc.nextInt();
		     }
		     String s="";
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            for(int k=j+1;k<n;k++)
		            {
		               for(int l=k+1;l<n;l++)
		               {
		                   if((arr[i]+arr[j]+arr[k]+arr[l])==kt)
		                    {
		                        String h=arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" $";
		                        if(!s.contains(h))
		                        s=s+h;
		                    }
		               }
		            }
		        }
		    }
		    if(s.equals(""))
		     s="-1";
		    System.out.println(s);
		}
	}
}
