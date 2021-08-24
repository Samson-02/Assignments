package com.company;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    int input;
    System.out.print("Make a selection:-  \n 1.Wow\t 2.Excitement\t 3.Happy\t");
    Scanner sc=new Scanner(System.in);
    input=sc.nextInt();
    switch(input)
    {
      case 1 : System.out.println(" You have selected 'Wow' ");
                break;
      case 2 : System.out.println(" You have selected 'Excitement' ");
                break;
     case 3 : System.out.println(" You have selected 'Happy' ");
                break; 
     Default : System.out.println(" Invalid selection. ");
    }
  }
}
                
        
