package com.coding;
import java.util.Scanner;
public class Day6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%3==0 || n%2==0) {
			System.out.println("Divible by Either 3 or 2");
		}
		else {
			System.out.println("Not divible by 3 and 2");
		}
	}
}

