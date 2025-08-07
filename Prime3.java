package com.coding;
import java.util.Scanner;
public class Prime3 {
	public static String checkPrime(int n) {
		if(n<=1) {
			return "Not Prime";
		}
		for (int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				return "Not Prime";
			}
			
		}
		return "Prime";
	}
	
	public static void main(String args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String res=checkPrime(n);
	}
}
