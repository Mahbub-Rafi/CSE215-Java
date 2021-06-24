import java.util.Formatter;

public class CA2_Desktop_2021463 extends CA2_PC_2021463 {
  private boolean hasRGB;
  
  public CA2_Desktop_2021463(String modelNumber, String countryOfOrigin, double price, CA2_Configuration_2021463 configuration,
                             boolean hasRGB) {
    super(modelNumber, countryOfOrigin, price, configuration);
    this.hasRGB = hasRGB;
  }
  
  public boolean isHasRGB() {
    return hasRGB;
  }
  
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("\n%-20s: %-20s\n", "Model Number", this.getModelNumber());
    formatter.format("%-20s: %-20s\n", "Price", this.getPrice());
    formatter.format("%-20s: %-20s\n", "CPU", this.getConfiguration().cpu);
    formatter.format("%-20s: %-20s\n", "GPU", this.getConfiguration().gpu);
    formatter.format("%-20s: %-20s\n", "Ram", this.getConfiguration().ram);
    
    return formatter.toString();
  }
  
}
