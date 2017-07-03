package code;
import java.util.*;
public class SumofdigitsPalindrome {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int m=0,sum=0;
	int rem=0,rev=0;
	while(number>0){
		m=number%10;
		sum=sum+m;
		number/=10;
	}
	System.out.println(sum);
	int temp=sum;
	while(temp>0){
		rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	
		}
	if(rev==sum){
		System.out.println("sum is palindrome");
	}
	else{
		System.out.println("sum is not a palindrome");
	}
}
}
