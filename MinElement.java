package com.coding;

import java.util.Scanner;

public class MinElement {
	public static int minElement(int[] ar) {
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int res = minElement(ar);
		System.out.println(res);
	}
}
