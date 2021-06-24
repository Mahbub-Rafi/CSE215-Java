import java.util.Arrays;
import java.util.Formatter;

public class CA2_Driver_2021463 {
  public static void main(String[] args) {
    CA2_PC_2021463[] pcArray = new CA2_PC_2021463[10];
    
    pcArray[0] = new CA2_Laptop_2021463("Asus X407", "Taiwan", 50_000,
      new CA2_Configuration_2021463("Asus X407", "Intel Core i5", 8, 265,
        "Intel UHD 620", "120W"),
      6);
    
    pcArray[1] = new CA2_Laptop_2021463("HP ProBook 440", "USA", 71_000,
      new CA2_Configuration_2021463("ProBook 440", "Intel Core i7", 8, 500,
        "Intel UHD 720", "135W"),
      7);
    
    pcArray[2] = new CA2_Laptop_2021463("Dell Inspiron 15-3583", "USA", 38_500,
      new CA2_Configuration_2021463("Inspiron 15", "Intel Dual Core", 4, 120,
        "Intel e4000", "75W"),
      3);
    
    pcArray[3] = new CA2_Laptop_2021463("Lenovo Ideapad S145", "China", 41_500,
      new CA2_Configuration_2021463("Ideapad S145", "Intel Core i3", 4, 125,
        "Intel UHD 620", "65W"),
      5);
    
    pcArray[4] = new CA2_Laptop_2021463("MSI Stealth 15M A11SDK", "Taiwan", 150_000,
      new CA2_Configuration_2021463("MSI A11SDK", "Intel Core i7", 16, 512,
        "GTX 1660 TI", "150W"),
      6);
    
    pcArray[5] = new CA2_Desktop_2021463("Lenovo ThinkStation P320", "China", 165_000,
      new CA2_Configuration_2021463("Intel C236", "Intel Xenon ", 16, 512,
        "NVIDIA Quadro P4000", "550W"),
      true);
    
    pcArray[6] = new CA2_Desktop_2021463("HP Omen Y0N84AA", "USA", 192_000,
      new CA2_Configuration_2021463("Intel Z270 Chipset", "Intel Core i7", 16, 512,
        "RTX 2060 Super", "650W"),
      true);
    
    pcArray[7] = new CA2_Desktop_2021463("Dell Vostro 3671", "USA", 31_500,
      new CA2_Configuration_2021463("Intel B365", "Intel Core i3", 4, 120,
        "Intel UHD 630", "450W"),
      false);
    
    pcArray[8] = new CA2_Desktop_2021463("ASUS D641MD", "Taiwan", 65_000,
      new CA2_Configuration_2021463("Intel B236", "Intel Core i7", 4, 128,
        "Intel UHD 730", "450W"),
      true);
    
    pcArray[9] = new CA2_Desktop_2021463("Apple iMac", "USA", 210_000,
      new CA2_Configuration_2021463("Apple", "Intel Core i5", 8, 256,
        "Radeon Pro 5300", "650W"),
      true);
    
    
    System.out.println(Arrays.toString(pcArray));
    
    CA2_PC_2021463[] randomPCArray = {pcArray[getRandomIndex()], pcArray[getRandomIndex()], pcArray[getRandomIndex()],
      pcArray[getRandomIndex()]};
    
    Arrays.sort(randomPCArray);
    
    for (int i = 0; i < 4; i++) {
      for (int j = i + 1; j < 4; j++) {
        printComparedObjects(randomPCArray[i], randomPCArray[j]);
      }
    }
  }
  
  public static int getRandomIndex() {
    return (int) (Math.random() * (10 - 1) + 1);
  }
  
  public static void printComparedObjects(CA2_PC_2021463 randomPCArray1, CA2_PC_2021463 randomPCArray2) {
    System.out.println("Comparing " + randomPCArray1.getModelNumber() + " with " + randomPCArray2.getModelNumber()
      + ": " + randomPCArray1.compareTo(randomPCArray2) + "\nA summary is given below:\n");
    
    Formatter formatter = new Formatter(new StringBuilder());
    
    formatter.format("%-20s : %-30s| %-30s\n", "Model Number", randomPCArray1.getModelNumber(), randomPCArray2.getModelNumber());
    formatter.format("%-20s : %-30s| %-30s\n", "Price", randomPCArray1.getPrice(), randomPCArray2.getPrice());
    formatter.format("%-20s : %-30s| %-30s\n", "CPU", randomPCArray1.getConfiguration().cpu, randomPCArray2.getConfiguration().cpu);
    formatter.format("%-20s : %-30s| %-30s\n", "GPU", randomPCArray1.getConfiguration().gpu, randomPCArray2.getConfiguration().gpu);
    formatter.format("%-20s : %-30s| %-30s\n", "Ram", randomPCArray1.getConfiguration().ram, randomPCArray2.getConfiguration().ram);
    
    System.out.println(formatter);
  }
  
}

