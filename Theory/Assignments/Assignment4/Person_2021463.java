package iftekher;

import java.time.LocalDate;

public abstract class Person_2021463 {
  private String fullName;
  private int NID;
  private LocalDate dateOfBirth;
  
  public Person_2021463(String fullName, int NID, LocalDate dateOfBirth) {
    this.fullName = fullName;
    this.NID = NID;
    this.dateOfBirth = dateOfBirth;
  }
  
  public Person_2021463() {
  
  }
  
  public String getFullName() {
    return fullName;
  }
  
  public int getNID() {
    return NID;
  }
  
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
  
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  
  public void setNID(int NID) {
    this.NID = NID;
  }
  
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  @Override
  public String toString() {
    return "Person{" +
      "fullName='" + fullName + '\'' +
      ", NID=" + NID +
      ", dateOfBirth=" + dateOfBirth +
      '}';
  }
}
