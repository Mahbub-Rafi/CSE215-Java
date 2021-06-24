package iftekher.practise;

import java.util.Formatter;

public class QuadraticEquation_2021463 {
  private double a;
  private double b;
  private double c;
  
  public QuadraticEquation_2021463(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  private double getDiscriminant() {
    return (b*b - 4*a*c);
  }
  
  public void evaluateDiscriminant() {
    if (getDiscriminant() > 0) {
      System.out.println("Two distinct solutions");
      System.out.println(getRoot1());
      System.out.println(getRoot2());
    } else if (getDiscriminant() == 0) {
      System.out.println("One unique solution");
      System.out.println(getRoot1());
    } else if (getDiscriminant() < 0) {
      System.out.println("No real solutions");
    } else
      System.out.println("Not possible to calculate solutions since discriminant is negative");
  }
  
  public double getRoot1() {
    return ((-b + Math.sqrt(getDiscriminant())) / (2*a));
  }
  
  public double getRoot2() {
    return ((-b - Math.sqrt(getDiscriminant())) / (2*a));
  }
  
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    formatter.format("%-15s | %-15s\n", "Coefficient", "Value");
    formatter.format("------------------------------------\n");
    formatter.format("%-15s | %.3f\n", "a", this.a);
    formatter.format("------------------------------------\n");
    formatter.format("%-15s | %.3f\n", "b", this.b);
    formatter.format("------------------------------------\n");
    formatter.format("%-15s | %.3f\n", "c", this.c);
    formatter.format("------------------------------------\n");
    return formatter.toString();
  }
  
}
