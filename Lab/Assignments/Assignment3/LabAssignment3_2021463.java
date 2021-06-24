import java.util.Scanner;

public class LabAssignment3_2021463 {
  public static int[] totalWorkingHours(int[][] workingHourData) {
    int[] totalHour = new int[8];
    
    
    for (int row = 0; row < workingHourData.length; row++) {
      int total = 0;
      for (int column = 0; column < workingHourData[row].length; column++) {
        total += workingHourData[row][column];
        
      }
      totalHour[row] = total;
    }
    return totalHour;
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] input = new int[8][7];
    
    System.out.println("Enter the weekly working hours of each employee: ");
    
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        input[i][j] = scan.nextInt();
      }
    }
    
    int[] printTotalHour = totalWorkingHours(input);
    
    
    for (int i = 0; i < 8; i++) {
      System.out.printf("Employee %d: %d hours\n", i + 1, printTotalHour[i]);
    }
  }
}
