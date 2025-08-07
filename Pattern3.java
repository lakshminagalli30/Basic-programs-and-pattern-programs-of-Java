package com.coding;

import java.util.Scanner;

public class Pattern3 {
	public static void pattern3(int n) {
		
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		
	}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			pattern3(n);
			
			
		}

}
