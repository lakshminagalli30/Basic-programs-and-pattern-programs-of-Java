package com.coding;

import java.util.Scanner;

public class Pattern4 {
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
			
		
	}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			pattern4(n);
			
			
		}

}
