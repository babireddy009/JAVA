package com.babireddy.addtwonumbers;

import java.util.Scanner;

public class AddTwoNumbers {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first no");
	        int n1 = sc.nextInt();
	        System.out.println("Enter the second no");
	        int n2 = sc.nextInt();
	        
	        int sum = n1+n2;
	        System.out.println("Sum of two numbers = "+sum);
	    }
	}
