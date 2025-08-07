package com.coding;
import java.util.Scanner;
public class Prime1 {
	public static String checkPrime(int n) {
		int count=0;
		for (int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
				if(count==2) {
					return "Prime Number";
				}
			}
		}
		return "Not Prime Number";
	}

	
	public static void main(String args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String res=checkPrime(n);
	}
}



