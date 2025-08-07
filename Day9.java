
package com.coding;
import java.util.Scanner;
public class Day9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%10==0) {
			System.out.println("Yes,Ending with 0 ");
		}
		else {
			System.out.println("Not ending with 0");
		}
	}
}