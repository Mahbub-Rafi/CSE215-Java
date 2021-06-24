import java.util.Date;

class Television{
  private final String mSerialNo;
  private final Date mManufactureDate;
  private static int count = 1;
  private static String mSerialHeader = "Serial";

  private String mModelName;
  private int mNumberOfPort;
  private String mManufacturePlace;

  private Television(){
    mSerialNo = generateSerial();
    mManufactureDate = new Date();
    count++;
  }
  public static Television buildTV(){
    return new Television();
  }
  private static String generateSerial(){
    StringBuilder sb = new StringBuilder(mSerialHeader);
    sb.append("_");
    sb.append(count);
    return sb.toString();
  }
  public String getModelName() {
    return mModelName;
  }
  public void setModelName(String mModelName) {
    this.mModelName = mModelName;
  }
  public int getNumberOfPort() {
    return mNumberOfPort;
  }
  public void setNumberOfPort(int mNumberOfPort) {
    this.mNumberOfPort = mNumberOfPort;
  }
  public String getManufacturePlace() {
    return mManufacturePlace;
  }
  public void setManufacturePlace(String mManufacturePlace) {
    this.mManufacturePlace = mManufacturePlace;
  }

  @Override
  public String toString() {
    return "Television{" +
      "mSerialNo='" + mSerialNo + '\'' +
      ", mManufactureDate=" + mManufactureDate +
      ", mModelName='" + mModelName + '\'' +
      ", mNumberOfPort=" + mNumberOfPort +
      ", mManufacturePlace='" + mManufacturePlace + '\'' +
      '}';
  }
}

public class BuilderExample {
  public static void main(String[] args) {
    Television tv1 = Television.buildTV();
    tv1.setManufacturePlace("Bangladesh");
    Television tv2 = Television.buildTV();
    tv2.setModelName("Sony");

    System.out.println(tv1);
    System.out.println(tv2);
  }
}
