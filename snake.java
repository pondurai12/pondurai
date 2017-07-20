import java.util.Scanner;

public class Snake {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=in.nextInt();
	for(int i=0;i<n;i++){
		if(i==0|| i==n-1)
			for(int j=0;j<n;j++)
				System.out.print("* ");
			
				else{
				
		for(int k=0;k<n;k++){
			if(k==0 || k==n-1){
			System.out.print("* ");
			}
			else
			System.out.print("  ");
				
			
		}
		}
		System.out.println();
	}
}
}

