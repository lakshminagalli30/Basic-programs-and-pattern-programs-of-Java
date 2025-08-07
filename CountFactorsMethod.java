package com.coding;
import java.util.Scanner;
public class CountFactorsMethod {
	public static int countfactors(int n) {
		int count=0;
		for (int i =1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int res=countfactors(n);
			System.out.println(res);
	}

}
