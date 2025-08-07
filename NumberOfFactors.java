package com.coding;
import java.util.Scanner;
public class NumberOfFactors {
	public static void main(String[] args[]) {
		int count=0;
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			for (int i = 0; i <=n; i++) {
				if(n%i==0) {
					count++;
					System.out.println(count);
				}
			}
				
			}

}
