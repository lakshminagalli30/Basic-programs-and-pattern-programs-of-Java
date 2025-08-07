package com.coding;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		// CREATING ARRAY
		int[] ar = new int[n];
		
		
		 // TAKING ARRAY ELEMENTS(I/P)
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		} 
		
		
		// PRINTING ARRAY ELEMENTS
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
