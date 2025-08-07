package com.coding;

import java.util.Scanner;

public class LCM {
	public static int findHCF(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	
	public static int findLCM(int a, int b) {
		return (a*b)/findHCF(a,b);
	}
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		int res=findLCM(a,b);
		System.out.println(res);
	}

}
