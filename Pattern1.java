package com.coding;

import java.util.Scanner;

public class Pattern1 {
	public static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		pattern1(n);
		
		
	}

}
