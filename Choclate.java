package code;
import java.util.*;
public class Choclate {
	public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a=in.nextInt();
if(n==0 || a==0){
	int v=0;
	System.out.println(v);
	
}
else if(n==a){
	int e=a*n-1;
	System.out.println(e);
}
else if(n!=a){
	int d=a*n-1;
	System.out.println(d);
}


}
}