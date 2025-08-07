package com.coding;
import java.util.Scanner;
public class Day10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if (n%10==7) {
			System.out.println("Ending with 7");
		}
		else {
			System.out.println("Not ending with 7");
		}
	}
}
