package com.coding;
import java.util.Scanner;
public class FirstPrimeNumbers {

	//METHOD FOR CHECKING PRIME
	
	public static boolean checkPrime(int n) {
		for(int i=2;i*i<=n/2;n++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
}
	
	//METHOD FOR PRINT FIRST N PRIMES
	
public static void firstnPrimes(int n) {
	int count=0;
	for(int i=2;count<n;i++) {
		if(checkPrime(i)) {
			System.out.println(i);
			count++;
		}
	}
}

//MAIN METHOD

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		firstnPrimes(n);
}
}

