package com.wipro;
import java.util.*;
public class Seed {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = scan.nextInt();
	int c[] = new int[20];
	int j= 0;
	int count = 0;
	int sum = 1;
	int sum1 = n;
	while(n>0){
		int m = n%10;
		c[j] = m;
		n/=10;
		j++;
		count++;
	}
	for(j=count-1;j>=0;j--){
		sum = sum * c[j] ;
	}
	System.out.println(sum*sum1);
}}

