package com.coding;

import java.util.Scanner;

public class Pattern9 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			pattern(n);
			
			
		}

}
