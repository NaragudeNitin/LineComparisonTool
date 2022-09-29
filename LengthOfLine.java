package com.Linecomparison;

import java.util.Objects;
import java.lang.Math;

public class LengthOfLine {
	public static double LengthOfLine1;
	public static double LengthOfLine2;

	public void setLengthOfLine1() {
		int x1 = 1;
		int y1 = 4;
		int x2 = 5;
		int y2 = 1;
		LengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line with co-ordinates (x1,y1),(" + x1 + "," + y1 + ")" + " and (x2,y2), ("
				+ x2 + "," + y2 + ") is " + LengthOfLine1);
	}

	public void setlengthOfLine2() {
		int p1 = 14;
		int q1 = 19;
		int p2 = 2;
		int q2 = 3;
		LengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("Length of the line with co-ordinates (x1,y1),(" + p1 + "," + q1 + ")" + " and (x2,y2), ("
				+ p2 + "," + q2 + ") is " + LengthOfLine2);
	}

	public void comparison() {

		boolean compare = Objects.equals(LengthOfLine1, LengthOfLine2);
		if (compare) {
			System.out.println("Two lines are equal in length");
		} else
			System.out.println("Length of two lines is not equal");
	}

	public void Cmpto() {
		Integer line1 = (int) LengthOfLine1;
		Integer line2 = (int) LengthOfLine2;
		int comp2 = line1.compareTo(line2);
		if (comp2 == 0) {
			System.out.println("Lines are equal");
		} else if (comp2 > 1) {
			System.out.println("Line 1 is greater than line2");
		} else
			System.out.println("Line2 greater than line 1");
	}

	public static void main(String[] args) {
		LengthOfLine check = new LengthOfLine();
		System.out.println("Calling method1 ");
		check.setLengthOfLine1();
		System.out.println("Calling method2 ");
		check.setlengthOfLine2();
		check.comparison();
		check.Cmpto();

	/**	if (LengthOfLine1 > LengthOfLine2) {
			System.out.println("Line 1 is greater than line 2");
		} else if (LengthOfLine1 == LengthOfLine2) {
			System.out.println("Line1 and line2 are equal");
		} else {
			System.out.println("Line2 is greater");
		}
	 */
	}
}
