package cse215.module13ExceptionHandling.p03Rethrow;

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

public class Ex03 {
  private static void method(){
    try {
      Circle c1 = new Circle(5);
      Circle c2 = new Circle(-50);
      Circle c3 = new Circle(2);
    }catch (IllegalArgumentException ex){
      System.out.println(ex.getMessage());
      throw ex;
    }finally {
      System.out.println("Number of Objects created "
        + Circle.getNumberOfObjects() );
    }
  }

  public static void main(String[] args) {
    try {
      method();
    }catch (IllegalArgumentException ex){
      System.out.println("In main method");
    }
  }
}
