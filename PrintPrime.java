package com.coding;
import java.util.Scanner;
//METHOD FOR CHECKING PRIME OR NOT
public class PrintPrime {
	public static boolean checkPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	//METHOD FOR PRINTING PRIME NUMBERS
	
	public static void printPrimes(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	//MAIN METHOD
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int n1=scan.nextInt();
			int n2=scan.nextInt();
			printPrimes(n1,n2);
	}
}
	
	
	
	
