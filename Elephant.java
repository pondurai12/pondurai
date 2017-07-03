package code;
import java.util.*;
public class Elephant{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int elephant=in.nextInt();
		int count=0;
		int sum=0;
		int elephantweight=in.nextInt();
		int []capacity=new int[elephant];
	
		for(int i=0;i<elephant;i++){
			capacity[i]=in.nextInt();
			
		}
		Arrays.sort(capacity);
		in.close();
		for(int i=0;i<capacity.length;i++){
			if(sum<elephantweight){
			sum+=capacity[i];
			
			if(sum<=elephantweight)
				count++;
			}
		}
		System.out.print(count);
	}
}
