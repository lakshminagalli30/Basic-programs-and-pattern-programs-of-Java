package com.coding;

import java.util.Scanner;

public class Pattern15 {
	public static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n+1)-i;j++) {
				System.out.print("* ");
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
