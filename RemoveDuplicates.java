import java.util.*;
public class StringDuplicates {
	  public static void main(String args[])
	    {
	        Scanner in=new Scanner(System.in);
	        System.out.print("Enter  word : ");
	        String s = in.nextLine();
	        int l = s.length();
	        char c;
	        String ans="";
	         
	        for(int i=0; i<l; i++)
	        {
	            c = s.charAt(i);
	            if(c!=' ')
	                ans = ans + c;
	            s = s.replace(c,' ');
	        }
	 
	       System.out.println(  ans);
	    }
	}
