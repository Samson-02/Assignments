package com.company;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

System.out.println("Calculation of years and days given the minutes\n");
System.out.print("Enter the number of minutes :- ");
Scanner sc = new Scanner(System.in);
double min = sc.nextDouble();

long years = (long) (min/(60*24*365));
long days = (long) (min/60/24)%365;

System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");
}
}

