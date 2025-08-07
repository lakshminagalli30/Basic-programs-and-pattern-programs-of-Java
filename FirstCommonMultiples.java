package com.coding;
import java.util.Scanner;
public class FirstCommonMultiples {
	public static void firstcommonmul(int n,int a,int b) {
		int count=0;
		for(int i=1;count<n;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			firstcommonmul(n, a, b);
}
}

