package com.coding;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//PRINTING NUMBERS
		/*for(int i=1;i<=n;i++) {
			System.out.println(i);
		}*/
		
		
		// PRINTING EVEN NUMBERS
		/*for(int i=0;i<=n;i=i+2){
			System.out.println(i);
	}*/
		
		
		//PRINTING ODD NUMBERS
		/*for(int i=1;i<=n;i=i+2) {
			System.out.println(i);
		*/
		
		
		//DECREASING ORDER
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
}
}

