package iftekher.practise;

public class CA1_Task3_2021463 {
  public static double computeAreaOfNonagon(double lengthOfSide) {
    return (2.25 * lengthOfSide * lengthOfSide) / Math.tan(Math.toRadians(180.0 / 9));
  }
  
  public static double computeAreaOfDecagon(double lengthOfSide) {
    return 2.5 * lengthOfSide * lengthOfSide * Math.sqrt(5 + 2 * Math.sqrt(5));
  }
  
  public static void main(String[] args) {
    double lengthOfSide = 10, areaOfNonagon, areaOfDecagon;
    
    for (int i = 10; i <= 50; i++) {
      areaOfNonagon = computeAreaOfNonagon(lengthOfSide);
      areaOfDecagon = computeAreaOfDecagon(lengthOfSide);
      System.out.println("Area of a Nonagon with a side length of " + lengthOfSide + " is " + areaOfNonagon + ", and that of a \nDecagon is " + areaOfDecagon + "\n");
      lengthOfSide = lengthOfSide + Math.sqrt(10);
    }
  }
}
