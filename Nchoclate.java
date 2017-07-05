package code;
import java.util.*;
public class Nchoclate {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=1;
		int count=n;
		int[] rating=new int[n];
		for(int i=0;i<n;i++){
			rating[i]=in.nextInt();
		
		}
      Arrays.sort(rating);
		for(int i=0;i<n-1;i++){
			if(rating[i+1]>rating[i]){
				count+=sum++;
			}
		}
		System.out.println("minimum choclate is "+count);
		in.close();
	}

}