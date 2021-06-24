package cse215.module14FileIO.p04BinaryIO.sp03BufferStream;

import java.io.*;

/**
 * BufferedInputStream and BufferedOutputStream can be used to speed up
 * input and output by reducing the number of disk reads and writes.
 *
 * Using BufferedInputStream, the whole block of data on the disk is
 * read into the buffer in the memory once. The individual data
 * is then loaded into the program from the buffer.
 *
 * Using BufferedOutputStream, the whole block of data is written to the
 * disk once.
 */

class TestDataStream{
  public static void method() throws IOException {
    try(
      FileOutputStream fos = new FileOutputStream("data/temp2.dat");
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      DataOutputStream output = new DataOutputStream(bos);
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
      BufferedInputStream bis = new BufferedInputStream(fis);
      DataInputStream input = new DataInputStream(bis);
    ) {
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
    }
  }
}

public class Ex10 {
  public static void main(String[] args) {
    try {
      TestDataStream.method();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}