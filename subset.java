package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	ArrayList<Integer> al=new ArrayList();
	for(int i=0;i<n;i++)
		al.add(in.nextInt());
	System.out.println("Enter 2nd number");
	ArrayList<Integer> al1=new ArrayList();
	for(int i=0;i<n;i++)
	al1.add(in.nextInt());
	if(al.containsAll(al1)){
		System.out.println("subset");
	}else{
		System.out.println("not subset");
	}
	
}
}