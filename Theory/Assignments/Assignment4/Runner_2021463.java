package iftekher;

import java.time.LocalDate;

public class Runner_2021463 {
  public static void main(String[] args) {
    NSUer_2021463 student1 = new NSUer_2021463();
    NSUTeachers_2021463 teacher1 = new NSUTeachers_2021463();
    NSUStaff_2021463 staff1 = new NSUStaff_2021463();
  
    student1.setID("2104321124");
    student1.setFullName("John Doe");
    student1.setNID(1903542335);
    student1.setDateOfBirth(LocalDate.of(1999, 7, 11));
  
    teacher1.setID("3204523236");
    teacher1.setFullName("Mr White");
    teacher1.setNID(1693453045);
    teacher1.setDateOfBirth(LocalDate.of(1985, 1, 19));
  
    staff1.setID("1963493070");
    staff1.setFullName("David Wine");
    staff1.setNID(1793829659);
    staff1.setDateOfBirth(LocalDate.of(1995, 4, 15));
  
  
    System.out.println(student1.toString());
    System.out.println(teacher1.toString());
    System.out.println(staff1.toString());
  }
}
