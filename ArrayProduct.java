package com.coding;

import java.util.Scanner;

public class ArrayProduct {
	public static long arrayProduct(int[] ar) {
		long p = 1;
		for (int i = 0; i < ar.length; i++) {
			p = p* ar[i];
		}
		return p;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		long res = arrayProduct(ar);
		System.out.println(res);

}
}
