package com.coding;
import java.util.Scanner;
public class Day8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%10==0) {
			System.out.println("Divisible by 2 and 5 and 10");
		}
		else {
			System.out.println("Not divible by 2 and 5 and 10");
		}
	}
}
