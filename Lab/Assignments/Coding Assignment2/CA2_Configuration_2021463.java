import java.util.Formatter;

public class CA2_Configuration_2021463 {
  public String motherboard;
  public String cpu;
  public int ram;
  public int ssd;
  public String gpu;
  public String psu;
  
  public CA2_Configuration_2021463(String motherboard, String cpu, int ram, int ssd, String gpu, String psu) {
    this.motherboard = motherboard;
    this.cpu = cpu;
    this.ram = ram;
    this.ssd = ssd;
    this.gpu = gpu;
    this.psu = psu;
  }
  
  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("%-20s: %-20s\n", "Motherboard", this.motherboard);
    formatter.format("%-20s: %-20s\n", "CPU", this.cpu);
    formatter.format("%-20s: %-20s\n", "Ram", this.ram);
    formatter.format("%-20s: %-20s\n", "SSD", this.ssd);
    formatter.format("%-20s: %-20s\n", "GPU", this.gpu);
    formatter.format("%-20s: %-20s\n", "PSU", this.psu);
    
    return formatter.toString();
  }
}
