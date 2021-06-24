package cse215.module13ExceptionHandling.p05CustomException;

/**
 * This is a checked exception.
 * must be caught using try-catch block or be thrown.
 */
class IllegalRadiusException extends Exception {
  private double radius;
  public IllegalRadiusException(double radius) {
    super("Invalid radius " + radius);
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }
}

class Circle{
  private double radius;
  private static int numberOfObjects = 0;
  public Circle()
    throws IllegalRadiusException{
    this(1.0);
  }
  public Circle(double radius)
    throws IllegalRadiusException{
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
    throws IllegalRadiusException {
    if(newRadius >= 0 )
      this.radius = newRadius;
    else
      throw new IllegalRadiusException(newRadius);
  }
  public double findArea(){
    return Math.PI * radius * radius;
  }
}

public class Ex05 {
  private static void method() throws IllegalRadiusException{
    try {
      Circle c1 = new Circle(5);
      c1.setRadius(-1);
    }catch (RuntimeException ex){
      System.out.println("RuntimeException in method()");
    }catch (Exception ex){
      ex.printStackTrace();
      System.out.println("Exception in method()");
      throw ex;
    }
  }
  public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");
    }catch (RuntimeException ex){
      System.out.println("RuntimeException in main");
    }catch (Exception ex){
      System.out.println("Exception in main");
    }
  }
}
