package com.coding;

import java.util.Scanner;

public class Pattern27 {
	public static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i || i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			pattern10(n);
			
			
		}
}
