package code;
import java.util.*;
public class Nplayers {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int a=0;
		int b=0;
		int s=0;
		if(number%2==0){
		  a=number/2;
		  System.out.println();
		int j=number-a;
		int d=j-a;
		System.out.println(a+" "+j);
		System.out.println(d);
		}
		else if(number%2==1){
			b=number/2;
			s=number-b;
			int k=s-b;
			System.out.println(s+" "+k);
			System.out.println(k);
		}
		}
}
