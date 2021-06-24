package iftekher.practise;

import java.util.Scanner;
public class CA1_Task4_2021463 {
  public static double recursiveLogSeriesSum(int n)
  {
    if (n == 1)
      return 1;
    if(n%2 == 0){
      double input = recursiveLogSeriesSum(n - 1);
      double result = 1 / Math.log (n);
      return result + input;
    }
    else{
      double input = recursiveLogSeriesSum(n - 1);
      double result = 1 / Math.log (n);
      return result - input;
    }
  }
  
  public static double iterativeLogSeriesSum(int n)
  {
    double sum = 1.0, input, result;
    if(n==1)
      return 1;
    for (int i = 2; i <= n; i++)
    {
      if(n%2==0){
        input = n-1;
        result = 1 / Math.log(i);
        sum += result;
      }
    }
    return sum;
  }
 
  public static void main (String [] args)
  {
    Scanner scan = new Scanner (System.in);
    int input;
    System.out.println ("Using recursive method: ");
    for(int i=0; i<3; i++){
      System.out.print ("Enter n: ");
      input = scan.nextInt ();
      System.out.println (recursiveLogSeriesSum(input));
    }
    
    
    System.out.println ("\n\nUsing iterative method: ");
    for(int i=0; i<3; i++){
      System.out.print ("Enter n: ");
      input = scan.nextInt ();
      System.out.println (iterativeLogSeriesSum(input));
    }
    
  }
}
