package cse215.module14FileIO.p02TextIO.sp02textread.sp01Regular;

import java.io.File;
import java.util.Scanner;

class ReadData{
  public static void readData() throws Exception{
    File file = new File("data/scores.txt");
    Scanner input = new Scanner(file);
    while(input.hasNext()){
      String firstName = input.next();
      String middleName = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(firstName + " " + middleName  + " " + lastName + " " + score);
    }
    input.close();
  }
}

public class Ex04 {
  public static void main(String[] args) {
    try {
      ReadData.readData();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
