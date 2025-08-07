package com.coding;
import java.util.Scanner;
public class Day5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%3==0) {
			System.out.println("Divible by 3");
		}
		else {
			System.out.println("Not divible by 3");
		}
	}
}