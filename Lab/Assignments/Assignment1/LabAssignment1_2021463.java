package com.iftekher_practise;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your id : ");
    int id = scan.nextInt();
    
    scan.nextLine();
    System.out.println("Enter your full name : ");
    String fullName = scan.nextLine();
    
    System.out.println("Enter your major information : ");
    String majorInfo = scan.next();
    
    String majorRoman = scan.next();
    
    int temp1 = 0;
    int temp2 = 0;
    
    System.out.printf("You are %s, %d, ", fullName, id);
    
    switch (majorInfo)
    {
      case "C" :
      case "c" :
        temp1 = 1;
        System.out.printf("Computer Science and Engineering, ");
        break;
      case "B" :
      case "b" :
        temp1 = 1;
        System.out.printf("Business Administration, ");
        break;
      case "M" :
      case "m" :
        temp1 = 1;
        System.out.printf("Microbiology, ");
        break;
    }
    
    switch (majorRoman)
    {
      case "i" :
        temp2 = 1;
        System.out.printf("Freshman.");
        break;
      case "ii" :
        temp2 = 1;
        System.out.printf("Sophomore.");
        break;
      case "iii" :
        temp2 = 1;
        System.out.printf("Junior.");
        break;
      case "iv" :
        temp2 = 1;
        System.out.printf("Senior.");
        break;
    }
    if(temp1 ==0 && temp2 ==0)
    {
      System.out.println("Sorry, invalid major information.");
    }
  }
}
