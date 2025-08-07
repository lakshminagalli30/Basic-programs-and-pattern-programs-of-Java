package com.coding;

import java.util.Scanner;

public class MaxElement {
	public static int maxElement(int[] ar) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int res = maxElement(ar);
		System.out.println(res);

}
}
