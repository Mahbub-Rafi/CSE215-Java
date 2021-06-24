import java.util.Formatter;
import java.util.Random;

public class PassportInfo {
  public String passportNumber;
  private String firstName;
  private String lastName;
  private String NIDNumber;
  private dateInfo dateOfBirth;
  private Picture picture;
  
  static class NewPicture {
    int red;
    int green;
    int blue;
    
    NewPicture() {
      red = (int) (Math.random() * 256);
      green = (int) (Math.random() * 256);
      blue = (int) (Math.random() * 256);
    }
  }
  
  static class Picture {
    NewPicture[][] picture = new NewPicture[40][50];
    
    Picture() {
      for (int i = 0; i < 40; i++) {
        for (int j = 0; j < 50; j++) {
          picture[i][j] = new NewPicture();
        }
      }
    }
  }
  
  private PassportInfo(String passportNumber, String firstName, String lastName, String NIDNumber, dateInfo datOfBirth,
                       Picture picture) {
    this.passportNumber = passportNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.NIDNumber = NIDNumber;
    this.dateOfBirth = datOfBirth;
    this.picture = picture;
  }
  
  public static PassportInfo Builder() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean existChecker;
    existChecker = false;
    
    for (int i = 0; !existChecker; i++) {
      char ch;
      
      ch = (char) ('A' + random.nextInt() % 26);
      stringBuilder.append(ch);
      
      ch = (char) ('A' + random.nextInt(26));
      stringBuilder.append(ch);
      
      for (int j = 0; j < 7; j++) {
        ch = (char) ('0' + random.nextInt(10));
        stringBuilder.append(ch);
      }
      
    }
    
    return (new PassportInfo(stringBuilder.toString()));
  }
  
  public String getPassportNumber() {
    return passportNumber;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getNIDNumber() {
    return NIDNumber;
  }
  
  public dateInfo getDateOfBirth() {
    return dateOfBirth;
  }
  
  public Picture getPicture() {
    return picture;
  }
  
  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }
  
  private PassportInfo(String passportNum) {
    setPassportNumber(passportNum);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setNIDNumber(String NIDNumber) {
    this.NIDNumber = NIDNumber;
  }
  
  public void setDateOfBirth(dateInfo dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public void setPicture(Picture picture) {
    this.picture = picture;
  }
  
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("%-20s : %-20s : %s\n", "Passport Information", "Passport Number", passportNumber);
    formatter.format("  %-20s %-20s : %s\n", " ", "First Name", firstName);
    formatter.format("  %-20s %-20s : %s\n", " ", "Last Name", lastName);
    formatter.format("  %-20s %-20s : %s\n", " ", "NID Number", NIDNumber);
    formatter.format("  %-20s %-20s : %s\n", " ", "Date Of Birth", dateOfBirth);
    formatter.format("  %-20s %-20s : %s\n", " ", "Picture", picture);
    
    return formatter.toString();
  }
  
  private static final String[] allPassportNumbers = new String[15];
  private static final String[] allNIDNumbers = new String[15];
  private static final Random random = new Random();
  
  
}
