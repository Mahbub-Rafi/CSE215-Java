package cse215.module13ExceptionHandling.p04ChainedException;

class ChainedExceptionDemo{
  private static void method2() throws Exception{
    throw new Exception("New info from method2");
  }
  private static void method1() throws Exception{
    try {
      method2();
    }catch (Exception ex){
      throw new Exception("New info from method1", ex);
    }
  }

  public static void method(){
    try {
      method1();
    }catch (Exception ex){
      ex.printStackTrace();
    }
  }
}

public class Ex04 {
  public static void main(String[] args) {
    ChainedExceptionDemo.method();
  }
}
