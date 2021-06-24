import java.util.Random;

public class Solution02 {
  public static void main(String[] args) {
    int cityNumber = (int) (Math.random() * (15 - 5 + 1)) + 5;
    String[] generateCityNames = new String[cityNumber];
    
    generateRandomCity(generateCityNames);
    
    int[][] generateDistance = setDistance(generateCityNames);
    
    printDistances(generateCityNames, generateDistance);
    
  }
  
  /**
   * This method generates randomly city names putting alphabets, using a string builder.
   */
  static void generateRandomCity(String[] randomCityNames) {
    String listOfChar = "abcdefghijklmnopqrstuvwxyz";
    Random randomCity = new Random();
    
    int i, j, length;
    
    for (i = 0; i < randomCityNames.length; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      length = randomCity.nextInt(6) + 5;
      j = 0;
      
      while (j < length) {
        stringBuilder.append(listOfChar.charAt(randomCity.nextInt(listOfChar.length())));
        j++;
      }
      randomCityNames[i] = stringBuilder.toString();
    }
  }
  
  /**
   * This method generates distance between two cities.
   *
   * @param cityNameString cityNameString is the string that contains the city names.
   */
  static int[][] setDistance(String[] cityNameString) {
    int[][] generateDistance = new int[cityNameString.length][cityNameString.length];
    for (int i = 0; i < cityNameString.length; i++) {
      for (int j = 0; j < cityNameString.length; j++) {
        if (i == j) {
          generateDistance[i][j] = 0;
        } else {
          int distanceTemp = (int) (Math.random() * (90 - 50 + 1)) + 50;
          generateDistance[i][j] = distanceTemp;
          generateDistance[j][i] = distanceTemp;
        }
      }
    }
    return generateDistance;
  }
  
  /**
   * This method prints the city name and distances in required format.
   *
   * @param generateCityNames cityNameString is the string containing city names.
   * @param generateDistance  generateDistance is the two dimensional array containing distances between two cities.
   */
  static void printDistances(String[] generateCityNames, int[][] generateDistance) {
    System.out.println("Total City Name Displayed: " + generateCityNames.length);
    System.out.println("=".repeat(generateCityNames.length * 22));
    
    for (String s : generateCityNames) {
      System.out.printf("%20s", s);
    }
    System.out.println();
    for (int i = 0; i < generateCityNames.length; i++) {
      System.out.printf("%10s", generateCityNames[i]);
      
      for (int j = 0; j < generateCityNames.length; j++) {
        System.out.printf("%20d", generateDistance[i][j]);
      }
      System.out.println();
    }
  }
}

