package com.coding;

import java.util.Scanner;

public class Pattern17 {
	public static void pattern10(int n) {
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print((char)(count+64)+" ");
				count++;
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
