package iftekher;

import java.time.LocalDate;

public class NSUer_2021463 extends Person_2021463 implements Student_2021463 {
  private String ID;
  private String fullName;
  private int NID;
  private LocalDate dateOfBirth;
  
  public NSUer_2021463(String ID, String fullName, int NID, LocalDate dateOfBirth) {
    super(fullName, NID, dateOfBirth);
    this.ID = ID;
  }
  
  public NSUer_2021463() {
  
  }
  
  public String getID() {
    return ID;
  }
  
  @Override
  public String getFullName() {
    return fullName;
  }
  
  @Override
  public int getNID() {
    return NID;
  }
  
  @Override
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
  
  @Override
  public String studentID() {
    return ID;
  }
  
  public void setID(String ID) {
    this.ID = ID;
  }
  
  @Override
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  
  @Override
  public void setNID(int NID) {
    this.NID = NID;
  }
  
  @Override
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  @Override
  public String toString() {
    return "\n" +
      "\tNSUer : \n" +
      "\tFull Name : \'" + fullName + "\',\n" +
      "\tID : \'" + ID + "\',\n" +
      "\tNID : \'" + NID + "\',\n" +
      "\tDate Of Birth : \'" + dateOfBirth + "\',\n";
  }
}
