package com.coding;
import java.util.Scanner;
public class PrintMultiples {
	public static void printMultiples(int n,int x) {
		for(int i=n;i<=x;i++) {
			if(i%n==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int x=scan.nextInt();
			printMultiples(n,x);
	}
}
