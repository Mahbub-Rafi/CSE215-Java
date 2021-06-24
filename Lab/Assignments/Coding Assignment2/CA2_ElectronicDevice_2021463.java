import java.util.Formatter;

public abstract class CA2_ElectronicDevice_2021463 {
  private final String modelNumber;
  private final String countryOfOrigin;
  private double price;
  
  public CA2_ElectronicDevice_2021463(String modelNumber, String countryOfOrigin, double price) {
    this.modelNumber = modelNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.price = price;
  }
  
  public String getModelNumber() {
    return modelNumber;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("%-20s: %-20s\n", "Model Number", this.modelNumber);
    formatter.format("%-20s: %-20s\n", "Country Of Origin", this.countryOfOrigin);
    formatter.format("%-20s: %-20s\n", "Price", this.price);
    
    return formatter.toString();
  }
}
