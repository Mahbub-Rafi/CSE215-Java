package cse215.module14FileIO.p04BinaryIO.sp02DataStream;

import java.io.*;

/**
 * If you keep reading data till the end of an IOStream, an
 * EOFException will occur. This exception can be used to
 * detect the end of a file.
 */
class DetectEndOfFile{
  public static void method(){
    try {
      try(
        FileOutputStream fos = new FileOutputStream("test3.dat");
        DataOutputStream output = new DataOutputStream(fos);
        ) {
        output.writeDouble(4.5);
        output.writeDouble(43.25);
        output.writeDouble(3.2);
      }

      try (FileInputStream fos = new FileInputStream("test3.dat");
           DataInputStream input = new DataInputStream(fos);
           ){
        while(true){
          System.out.println(input.readDouble());
        }
      }
    }catch (EOFException ex){
      System.out.println("All data were read");
    }catch (IOException ex){
      ex.printStackTrace();
    }
  }
}

public class Ex09 {
  public static void main(String[] args) {
    DetectEndOfFile.method();
  }
}
