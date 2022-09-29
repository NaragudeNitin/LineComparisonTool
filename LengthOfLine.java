package com.Linecomparison;

import java.util.Scanner;
import java.lang.Math;

public class LengthOfLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a1,b1,c1");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter the values of a2, b2, c2");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();

		Integer eq1 = a1 / a2;
		Integer eq2 = b1 / b2;
		Integer eq3 = c1 / c2;

		if (eq1.equals(eq2) && eq1.equals(eq3)) {
			System.out.println("Two lines are identical.");
		} else {
			System.out.println("Lines are not identical");
		}

		sc.close();
	}
}
