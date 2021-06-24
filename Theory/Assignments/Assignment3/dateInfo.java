public class dateInfo {
  // instance variables
  int day;
  int month;
  int year;
  
  dateInfo(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  @Override
  public String toString() {
    return (day + " / " + month + " / " + year);
  }
}

