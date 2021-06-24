package iftekher;

import java.time.LocalDate;

public class NSUStaff_2021463 extends Person_2021463 implements Teacher_2021463, Student_2021463 {
  private String ID;
  private String fullName;
  private int NID;
  private LocalDate dateOfBirth;
  
  public NSUStaff_2021463(String ID, String fullName, int NID, LocalDate dateOfBirth) {
    super(fullName, NID, dateOfBirth);
    this.ID = ID;
  }
  
  public NSUStaff_2021463() {
  
  }
  
  public String getID() {
    return ID;
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
  
  public void setID(String ID) {
    this.ID = ID;
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
  public String studentID() {
    return null;
  }
  
  @Override
  public String teacherID() {
    return null;
  }
  
  @Override
  public String toString() {
    return "\n" +
      "\tNSUStaff : \n" +
      "\tFull Name : \'" + fullName + "\',\n" +
      "\tID : \'" + ID + "\',\n" +
      "\tNID : \'" + NID + "\',\n" +
      "\tDate Of Birth : \'" + dateOfBirth + "\',\n";
  }
}
