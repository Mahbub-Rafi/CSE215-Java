package com.iftekher_practise;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your id : ");
    int id = scan.nextInt();
    
    scan.nextLine();  //to clear the input buffer.
    
    System.out.println("Enter your full name : ");
    String fullName = scan.nextLine();
    
    System.out.println("Enter your major information : ");
    char majorInfo = scan.next().charAt(0);
    
    String majorRoman = scan.next();
    
    //Convert to lowercase for easy further process.
    majorInfo = Character.toLowerCase(majorInfo);
    majorRoman = majorRoman.toLowerCase();
    
    //This two variables will contain the final info.
    String majorInfoFinal = "", majorRomanFinal ="";
    
    
    switch (majorInfo)
    {
      case 'm':
        majorInfoFinal = "Microbiology";
        break;
      case 'b':
        majorInfoFinal = "Business Administration";
        break;
      case 'c':
        majorInfoFinal = "Computer Science and Engineering";
        break;
    }
    
    switch (majorRoman)
    {
      case "i":
        majorRomanFinal = "Freshman";
        break;
      case "ii":
        majorRomanFinal = "Sophomore";
        break;
      case "iii":
        majorRomanFinal = "Junior";
        break;
      case "iv":
        majorRomanFinal = "Senior";
        break;
    }
    
    //Check if these variables were updated or not.
    if(majorInfoFinal.length() > 0 && majorRomanFinal.length() > 0)
    {
      System.out.println("You are " + id + ", " + majorInfoFinal + ", " + majorRomanFinal);
    }
    else
      System.out.println("Sorry, Invalid major Information.");
    
  }
}
