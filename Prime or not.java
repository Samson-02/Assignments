package com.company;
import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {

System.out.println("Finding whether a number is prime or not :- \n");
		System.out.print("Enter a number :  ");
		Scanner X = new Scanner(System.in);
		int num = X.nextInt();
		
		int i=0;
		for(int x=1;x<=num;x++)
		{
		    if(num % x == 0)
		    i++;
		}
		
		if(i == 2)
		System.out.println(num + " is a prime number.");
		else
		System.out.println(num + " is not a prime number.");
}
}
