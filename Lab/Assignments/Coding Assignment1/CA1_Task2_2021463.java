package iftekher.practise;

public class CA1_Task2_2021463 {
  public static void main(String[] args) {
    int startingSalary = 20000, currentSalary, savings = 0, year = 0;
    boolean flag = true;
    
    for (int i = 1; i <= 12 || savings <= 2500000; i++) {
      savings = (int) (savings + startingSalary * 6 * 0.45);
      currentSalary = (int) Math.round(startingSalary + startingSalary * 0.125);
      startingSalary = currentSalary;
      
      savings = (int) (savings + startingSalary * 6 * 0.45);
      currentSalary = (int) Math.round(startingSalary + startingSalary * 0.125);
      startingSalary = currentSalary;
      
      if(i==1)
        System.out.println("Monthly salary after " + i + " year: BDT " + currentSalary);
      else if (i <= 12)
        System.out.println("Monthly salary after " + i + " years: BDT " + currentSalary);
      
      if (savings >= 2500000 && flag) {
        year = i;
        flag = false;
      }
    }
    System.out.println("\nTotal number of years needed to buy a car worth BDT 2,500,000 assuming 45% of\n" +
      "monthly salary is saved: " + year + " years.");
  }
}
