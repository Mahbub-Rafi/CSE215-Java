package cse215.module13ExceptionHandling.p01intro;

import java.util.Scanner;

class Quotient {
  public static int quotient(int number1, int number2){
    if(number2==0){
      System.out.println("Divisor can not be zero");
      System.exit(1);
    }
    return number1/number2;
  }
  public static void test2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First integer : ");
    int number1 = input.nextInt();
    System.out.print("Enter Second integer : ");
    int number2 = input.nextInt();
    int result = quotient(number1, number2);
    System.out.println(number1 + " / " + number2 + " is " + result );
    System.out.println("Reach this line");
  }
  public static void test1(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First integer : ");
    int number1 = input.nextInt();
    System.out.print("Enter Second integer : ");
    int number2 = input.nextInt();
    System.out.println(number1 + " / " + number2 + " is " + number1/number2 );
    System.out.println("Reach this line");
  }
}

class QuotientWithException {
  public static int quotient(int number1, int number2){
    if(number2==0){
      throw new ArithmeticException("Divisor can not be zero");
    }
    return number1/number2;
  }
  public static void test(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First integer : ");
    int number1 = input.nextInt();
    System.out.print("Enter Second integer : ");
    int number2 = input.nextInt();
    try{
      int result = quotient(number1, number2);
      System.out.println(number1 + " / " + number2 + " is " + result );
    }catch (ArithmeticException ex){
      System.out.println("Exception: an integer "
        + "can not be divided by zero");
    }
    System.out.println("Exception continues");
  }
}

class Test1by0{
  public static void test() {
    System.out.println(10.0/0);
  }
}

public class Ex01 {
  public static void main(String[] args) {
    //Quotient.test1();
    //Quotient.test2();
    //System.out.println("This line reached in main()");
    //QuotientWithException.test();
    Test1by0.test();
  }
}
