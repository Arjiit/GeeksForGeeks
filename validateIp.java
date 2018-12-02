
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
public class validateIp {
	public boolean isValidIP(String s){
	   //Write your code here
	   String a="";
	   int count=0;
	   for(int i=0;i<s.length();i++)
	   {
	       if(s.charAt(i)!='.')
	       {
	           a=a+s.charAt(i);
	           if(!Character.isDigit(s.charAt(i)))break;
	       }
	       else
	       {
	           if(a.length()>3||a.length()==0)return false;
	          else if(a.length()>1&&Integer.parseInt(a)<((int)Math.pow(10,(a.length()-1))))return false;
	           else if(Integer.parseInt(a)>256)return false;
	           a="";
	           count++;
	       }
	       if(i==s.length()-1)
	       {
	           if(a.length()>3||a.length()==0)return false;
	           else if(a.length()>1&&Integer.parseInt(a)<((int)Math.pow(10,(a.length()-1))))return false;
	           else if(Integer.parseInt(a)>=256)return false;
	           a="";
	           count++;
	           //System.out.println(count);
	       }
	   }
	   if(count==4)return true;
	   else return false;
	   //return false;
	}
}