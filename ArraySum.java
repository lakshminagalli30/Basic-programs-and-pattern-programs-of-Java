package com.coding;

import java.util.Scanner;

public class ArraySum {
	public static int sumOfArrayElements(int[] ar) {
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
		
	}
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n = scan.nextInt();
	int[] ar=new int[n];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=scan.nextInt();
	}
	int res = sumOfArrayElements(ar);
	System.out.println(res);
}

}
