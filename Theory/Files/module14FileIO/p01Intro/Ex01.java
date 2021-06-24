package cse215.module14FileIO.p01Intro;

import java.io.File;
import java.util.Date;

public class Ex01 {

  private static void testDataText(){
    File file = new File("data/Text.txt");
    System.out.println("Does it exist ? : " + file.exists());
    System.out.println("This file has : " + file.length());
    System.out.println("Can it be read : " + file.canRead());
    System.out.println("Can it be written : " +file.canWrite());
    System.out.println("Is it a directory : " + file.isDirectory()) ;
    System.out.println("Is it a file : " + file.isFile());
    System.out.println("Is it absolute : " + file.isAbsolute());
    System.out.println("Is it hidden : " + file.isHidden());
    System.out.println("Absolute path is : " + file.getAbsolutePath());
    System.out.println("Last modified on : " + new Date(file.lastModified()));
  }
  private static void testFolder(){
    File file = new File("data");
    System.out.println("Does it exist ? : " + file.exists());
    System.out.println("This file has : " + file.length());
    System.out.println("Can it be read : " + file.canRead());
    System.out.println("Can it be written : " +file.canWrite());
    System.out.println("Is it a directory : " + file.isDirectory()) ;
    System.out.println("Is it a file : " + file.isFile());
    System.out.println("Is it absolute : " + file.isAbsolute());
    System.out.println("Is it hidden : " + file.isHidden());
    System.out.println("Absolute path is : " + file.getAbsolutePath());
    System.out.println("Last modified on : " + new Date(file.lastModified()));
    File[] files = file.listFiles();
    for(File f: files){
      System.out.println(f.getName());
    }

  }


  public static void main(String[] args) {
    //testDataText();
    testFolder();
  }
}
