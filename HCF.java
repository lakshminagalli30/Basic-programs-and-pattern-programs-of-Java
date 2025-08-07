package com.coding;

import java.util.Scanner;

public class HCF {
	public static int findHCF(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int res=findHCF(a,b);
		System.out.println(res);
	}

}
