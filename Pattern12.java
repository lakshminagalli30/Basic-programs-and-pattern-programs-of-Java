package com.coding;

import java.util.Scanner;

public class Pattern12 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
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
			pattern(n);
			
			
		}

}
