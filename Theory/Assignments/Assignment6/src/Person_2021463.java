public class Person_2021463 {
  private String passportNumber, firstName, lastName, NID, dateOfBirth;
  
  public Person_2021463(String passportNumber, String firstName, String lastName, String NID, String dateOfBirth) {
    this.passportNumber = passportNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.NID = NID;
    this.dateOfBirth = dateOfBirth;
  }
  
  public String getPassportNumber() {
    return passportNumber;
  }
  
  public String getNID() {
    return NID;
  }
}
