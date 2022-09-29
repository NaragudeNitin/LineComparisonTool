package com.Linecomparison;

import java.util.Scanner;
import java.lang.Math;

public class LengthOfLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Endpoints of first line");
		int x1 = 1;
		int y1 = 4;
		int x2 = 5;
		int y2 = 1;
		System.out.println("Endpoints of Second line");
		int p1 = 14;
		int q1 = 19;
		int p2 = 2;
		int q2 = 3;
		double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line with co-ordinates (x1,y1),(" + x1 + "," + y1 + ")" + " and (x2,y2), ("
				+ x2 + "," + y2 + ") is " + lengthOfLine1);
		double lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("Length of the line with co-ordinates (x1,y1),(" + x1 + "," + y1 + ")" + " and (x2,y2), ("
				+ x2 + "," + y2 + ") is " + lengthOfLine2);

		if (lengthOfLine1 == lengthOfLine2) {
			System.out.println("Two lines are equal");
		} else if (lengthOfLine1 > lengthOfLine2) {
			System.out.println("Length of line 1 is greater");
		} else {
			System.out.println("Length of line 2 is greater");
		}
		sc.close();
	}
}
