package cse215.module13ExceptionHandling.p02Throw;

class Circle{
  private double radius;
  private static int numberOfObjects = 0;
  public Circle(){
    this(1.0);
  }
  public Circle(double radius){
    setRadius(radius);
    numberOfObjects++;
  }
  public double getRadius() {
    return radius;
  }
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }
  public void setRadius(double newRadius)
    throws IllegalArgumentException {
    if(newRadius >= 0 )
      this.radius = newRadius;
    else
      throw new IllegalArgumentException("Radius can not be negative");
  }
  public double findArea(){
    return Math.PI * radius * radius;
  }
}

public class Ex02 {
  public static void main(String[] args) {
    try {
      Circle c1 = new Circle(5);
      Circle c2 = new Circle(-50);
      Circle c3 = new Circle(2);
      System.out.println("This line executes");
    }catch (IllegalArgumentException ex){
      //ex.printStackTrace();
      System.out.println(ex.getMessage());
    }finally {
      System.out.println("This line executes no matter what");
    }
    System.out.println("This line executes after exiting from try catch block");
  }
}
