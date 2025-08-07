package com.coding;
import java.util.Scanner;
public class Day12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=10 && n<=99) {
			System.out.println("Two digit number");
		}
		else {
			System.out.println("No two digit number");
		}
	}
}
