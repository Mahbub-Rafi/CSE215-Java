package cse215.module14FileIO.p04BinaryIO.sp02DataStream;

import java.io.*;

/**
 * DataInputStream reads bytes from stream, and converts them
 * to appropriate primitive type values or strings.
 * DataOutputStream converts primitive type values or Strings into
 * Bytes and outputs the bytes to the stream.
 */

class TestDataStream{
  public static void method() throws IOException {

    try(
      FileOutputStream fos = new FileOutputStream("data/temp2.dat");
      DataOutputStream output = new DataOutputStream(fos);
      ) {
      output.writeUTF("John");
      output.writeDouble(85.6);
      output.writeUTF("Jim");
      output.writeDouble(185.6);
      output.writeUTF("George");
      output.writeDouble(105.25);
    }

    try(
      FileInputStream fis = new FileInputStream("data/temp2.dat");
      DataInputStream input = new DataInputStream(fis);
      ) {
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
    }
  }
}

public class Ex08 {
  public static void main(String[] args) {
    try {
      TestDataStream.method();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
