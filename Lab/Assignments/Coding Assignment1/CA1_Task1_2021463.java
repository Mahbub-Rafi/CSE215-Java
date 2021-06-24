package iftekher.practise;

import java.util.Scanner;

public class CA1_Task1_2021463 {
  public static enum ISBN {
    ISBN_10,
    ISBN_13,
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.println("Please enter the ISBN type: ");
      String inputISBN = scan.next();
      System.out.println("Please enter the " + inputISBN + " number: ");
      String inputNumber = scan.next();

      ISBN eNum = ISBN.valueOf(inputISBN.toUpperCase());

      if (isValidISBN(eNum, inputNumber))
        System.out.println(inputNumber + " is a valid " + inputISBN + " number");
      else
        System.out.println(inputNumber + " is not a valid " + inputISBN + " number");
    }

  }

  public static boolean isValidISBN(ISBN eNum, String inputNumber) {
    int length = inputNumber.length();
    int number = Integer.parseInt(inputNumber);
    int sum = 0;

    if (eNum == eNum.ISBN_10) {
      if (length != 10)
        return false;
      for (int i = 0; i < 9; i++) {
        sum = sum + number * i;
      }
      sum = sum % 11;
      if (sum >= 0 && sum <= 10)
        return true;
      else
        return false;
    } else if (eNum == eNum.ISBN_13) {
      if (length != 13)
        return false;
      for (int i = 0; i < 13; i++) {
        if (i % 2 == 0)
          sum = sum + number * 1;
        else
          sum = sum + number * 3;
      }
      sum = sum % 10;
      if (sum == 0)
        return true;
      else
        return false;
    } else
      return false;
  }
}
