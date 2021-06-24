import java.util.Formatter;

public abstract class CA2_PC_2021463 extends CA2_ElectronicDevice_2021463 implements Comparable<CA2_PC_2021463> {
  private CA2_Configuration_2021463 configuration;
  
  public CA2_PC_2021463(String modelNumber, String countryOfOrigin, double price, CA2_Configuration_2021463 configuration) {
    super(modelNumber, countryOfOrigin, price);
    this.configuration = configuration;
  }
  
  public CA2_Configuration_2021463 getConfiguration() {
    return configuration;
  }
  
  public void setConfiguration(CA2_Configuration_2021463 configuration) {
    this.configuration = configuration;
  }
  
  public int compareTo(CA2_PC_2021463 comparePC) {
    if (this.getPrice() == comparePC.getPrice()) {
      if (this.configuration.cpu.compareTo(comparePC.configuration.cpu) == 0) {
        if (this.configuration.gpu.compareTo(comparePC.configuration.gpu) == 0) {
          if (this.configuration.ram == comparePC.configuration.ram) {
            return 0;
          } else {
            return -1;
          }
        } else {
          return -1;
        }
      } else {
        return -1;
      }
    } else {
      return -1;
    }
  }
  
  
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("%s\n", this.configuration);
    
    return formatter.toString();
  }
}
