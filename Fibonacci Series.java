package com.company;

public class Main
{
	public static void main(String[] args) {
	    int x=0,y=1,z;
	    System.out.print("Fibonacci series :- Every third number in the series is the sum of the previous 2 numbers\n");
		System.out.print("\t The first 2 numbers in the series is 0 and 1 \n");
		System.out.print(x+"  "+y);
		for(int i=1;i<=10;i++){
		    z=x+y;
		System.out.print("  "+z); 
		x=y;
		y=z;
		}
	}
}
