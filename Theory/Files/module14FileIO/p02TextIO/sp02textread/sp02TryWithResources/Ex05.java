package cse215.module14FileIO.p02TextIO.sp02textread.sp02TryWithResources;

import java.io.File;
import java.util.Scanner;

class ReadData{
  public static void readData() throws Exception{
    File file = new File("data/scores.txt");
    try(
      Scanner input = new Scanner(file);
      ){
      while(input.hasNext()){
        String firstName = input.next();
        String middleName = input.next();
        String lastName = input.next();
        int score = input.nextInt();
        System.out.println(firstName + " " + middleName  + " " + lastName + " " + score);
      }
    }
  }
}

public class Ex05 {
  public static void main(String[] args) {
    try {
      ReadData.readData();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
