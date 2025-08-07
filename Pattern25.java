package com.coding;

import java.util.Scanner;

public class Pattern25 {
	public static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int outerk=1;outerk<=i;outerk++) {
				System.out.print("  ");
			}
			if(i==n) {
				System.out.print("* ");
			}
			else {
				System.out.print("* ");
				for(int innerk=1;innerk<=2*(n-i)-1;innerk++) {
					System.out.print("  ");
				}
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
