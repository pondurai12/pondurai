package code;
import java.util.*;
public class Array1stElementRepeat {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int[] a=new int[number];
		int [] b=new int[10];
		int[] c=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					b[i]=a[i];
					break;
				}
			}
		}
		
		for(int i=0,j=0;i<a.length;i++)	{
			if(b[i]!=0){
				c[j]=b[i];
				j++;
			}
		
		
	}
		System.out.println(c[0]);

}
}
