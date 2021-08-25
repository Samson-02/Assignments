package com.company;
public class Main
{
	public static void main(String[] args) {
		int X[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int Y[][] = {{1,3,4},{2,4,3},{1,2,4}};
		System.out.println("The product of the matrices is :- ");
		for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
		    System.out.print((X[i][j] * Y[i][j]) + "  ");
		}
	     System.out.println();
		}
	}
}
