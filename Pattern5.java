package com.coding;

import java.util.Scanner;

public class Pattern5 {
	public static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			pattern5(n);
			
			
		}

}
