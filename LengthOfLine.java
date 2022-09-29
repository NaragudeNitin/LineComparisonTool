package com.Linecomparison;

import java.util.Scanner;
import java.lang.Math;

public class LengthOfLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x1=");
		int x1 = sc.nextInt();
		System.out.print("x2=");
		int y1 = sc.nextInt();
		System.out.print("x3=");
		int x2 = sc.nextInt();
		System.out.println("x4=");
		int y2 = sc.nextInt();
		
		double lengthOfLine=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of the line with co-ordinates (x1,y1),("+x1+","+y1+")"+ " and (x2,y2), ("+x2+","+y2+") is " + lengthOfLine);
		sc.close();
	}
}
