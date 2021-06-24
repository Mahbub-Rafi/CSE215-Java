package com.iftekher_practise;

import java.util.Scanner;

public class LabAssignment2_2021463 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  //Create a scanner for taking inputs.
  
    System.out.println("Please enter username: ");
    String username = scan.nextLine();  //Takes username input.
    
    System.out.println("Please enter password: ");
    String password = scan.nextLine();  //Takes password input.
    
    if(isValidUsername(username) && isValidPassword(password))  //Checks both methods to be valid.
    {
      System.out.println("Valid.");
    }
    
    else  //Checks which method(s) is not valid.
    {
      if(isValidUsername(username)==false)  //IDE suggests " !<methodName> " for false condition, Which is same as this line.
        System.out.println("Invalid username.");
  
      if(!isValidPassword(password))  // Tried both for practise.
        System.out.println("Invalid password.");
    }
  }
  
  public static boolean isValidUsername(String username)
  {
    if(username.equals(username.toLowerCase())) //Equals compare with that same string converted into lowercase.
    {                                           //If both are same, then the string is in lowercase.
                                                //Can also be checked manually with loop used in the other method.
      if(username.length()>3) //Checks for at least 4 characters long.
      {                       //Numbers are valid here.
        if(username.contains(" "))
        {
          return false;
        }
        else
          return true; //Returns true, validating all conditions mentioned. False otherwise.
      }
      else
        return false;
    }
    else
      return false;
  }
  
  
  public static boolean isValidPassword(String password)
  {
    if(password.length()>5) //Checks for at least 6 characters long. Spaces are valid here.
    {
      char temp;  //Declare a temporary character variable for validating Num, Lower and upper case.
      //Declare and initialising boolean num, lower and upper variable with false.
      boolean isNum = false;
      boolean isUpper = false;
      boolean isLower = false;
  
      for (int i=0; i<password.length(); i++) //This loop will manually check each character. Finding at least one num/lower/upper case will make its boolean value true.
      {
        temp = password.charAt(i);
        if (Character.isDigit(temp))
        {
          isNum = true;
        }
        else if (Character.isUpperCase(temp))
        {
          isUpper = true;
        }
        else if (Character.isLowerCase(temp))
        {
          isLower = true;
        }
      }
      
      if(isNum && isLower && isUpper) //Check all temporary boolean variable for at least one num+lower+uppercase is true. Returns false otherwise.
        return true;
      else
        return false;
    }
    else
      return false;
  }
}
