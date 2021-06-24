package cse215.module14FileIO.p04BinaryIO.sp01FileStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class TestFileStream{
  public static void method() throws IOException {

    try (
      FileOutputStream output = new FileOutputStream("data/temp1.dat");
    ) {
      for(int i=0; i<= 10; i++){
        output.write(i);
      }
    }

    try (
      FileInputStream input = new FileInputStream("data/temp1.dat");
    ) {
      int value;
      while ((value = input.read())!=-1){
        System.out.println(value + " ");
      }
    }
  }
}

public class Ex07 {
  public static void main(String... args) {
    try {
      TestFileStream.method();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
