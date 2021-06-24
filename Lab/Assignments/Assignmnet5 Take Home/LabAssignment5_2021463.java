package iftekher.practise;

import java.util.Scanner;

public class LabAssignment5_2021463 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double a, b, c;
    QuadraticEquation_2021463[] quadEqArr = new QuadraticEquation_2021463[3];
    
    
    for(int i=0; i<3; i++)
    {
      System.out.println("Enter the value of the coefficient a: ");
      a = scan.nextDouble();
  
      System.out.println("Enter the value of the coefficient b: ");
      b = scan.nextDouble();
  
      System.out.println("Enter the value of the coefficient c: ");
      c = scan.nextDouble();
  
      quadEqArr[i] = new QuadraticEquation_2021463(a, b, c);
      System.out.println(quadEqArr[i].toString());
      quadEqArr[i].evaluateDiscriminant();
      quadEqArr[i].getRoot1();
      quadEqArr[i].getRoot2();
    }
    
  }
}
