package com.coding;
import java.util.Scanner;
public class Prime2 {
	public static String checkPrime(int n) {
		int count=0;
		for (int i =2; i <n/2; i++) {
			if(n%i==0) {
				count++;
				if(count==2) {
					return "Prime";
				}
			}
			
		}
		return "Not Prime";
	}
	public static void main(String args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String res=checkPrime(n);
	}

}
