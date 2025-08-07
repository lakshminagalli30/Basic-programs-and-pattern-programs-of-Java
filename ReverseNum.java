package com.coding;

import java.util.Scanner;

public class ReverseNum {
	public static int reverseNum(int n) {
		int rev = 0;
		while(n>0) {
			int d = n%10;
			rev = rev*10+d;
			n=n/10;
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int  n=scan.nextInt();
			int res = reverseNum(n);
			System.out.println(res);

}
}

