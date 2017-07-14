package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rotate {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
		al.add(in.nextInt());
	
		System.out.println(" "+al);
		
		System.out.println("Enter the Number to rotate ");
		int num = in.nextInt();
		Collections.rotate(al, num);
	System.out.println("rotated "+al);
}
}