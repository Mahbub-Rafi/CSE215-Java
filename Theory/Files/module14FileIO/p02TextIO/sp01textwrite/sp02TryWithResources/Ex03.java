package cse215.module14FileIO.p02TextIO.sp01textwrite.sp02TryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

class WriteData{
  public static void method()
    throws FileNotFoundException
    , IOException {
    File file = new File("data/scores.txt");
    if(file.exists()){
      System.out.println("File already exists");
      System.exit(1);
    }

    /**
     * Try with resources
     * */
    try(
      PrintWriter output = new PrintWriter(file);
      ){
      output.print("SHAIKH SHAWON AREFIN SHIMON ");
      output.println(90);
      output.print("ABUL KALAM ");
      output.println(85);
    }
  }
}

public class Ex03 {
  public static void main(String[] args) {
    try {
      WriteData.method();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
