import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Driver_2021463 {
  public static void main(String[] args) throws IOException {
    File dataFile = new File("data.txt");
    Scanner scanner = new Scanner(dataFile);
    
    ArrayList<Person_2021463> personArrayList = new ArrayList<>();
    
    while (scanner.hasNext()) {
      String[] personString = scanner.nextLine().split(" ");
      personArrayList.add(new Person_2021463(personString[0], personString[1], personString[2], personString[3], personString[4]));
    }
    scanner.close();
    
    sortedByNID(personArrayList);
  }
  
  /**
   * Here I am using Hashmap for sorting. One main reason of using it allows user to sort any type
   * of object in key value pair.
   *
   * @param personArrayList personArray list is the ArrayList extracted from to data.txt file.
   * @throws IOException
   */
  public static void sortedByNID(ArrayList<Person_2021463> personArrayList) throws IOException {
    TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();
    for (Person_2021463 person : personArrayList) {
      String NID = person.getNID();
      String passport = person.getPassportNumber();
      
      ArrayList<String> passportArrayList;
      if (treeMap.containsKey(NID)) {
        passportArrayList = treeMap.get(NID);
        passportArrayList.add(passport);
        Collections.sort(passportArrayList);
      } else {
        passportArrayList = new ArrayList<>();
        passportArrayList.add(passport);
      }
      treeMap.put(NID, passportArrayList);
    }
    
    /**
     * Below code is to save the sorted personArrayList into a text file and also print it out in output console.
     */
    File sortedFile = new File("sortedFile.txt");
    PrintWriter printWriter = new PrintWriter(sortedFile);
    
    for (Map.Entry mapElement : treeMap.entrySet()) {
      String NID = (String) mapElement.getKey();
      ArrayList<String> passportsList = treeMap.get(NID);
      printWriter.println("NID: " + NID + " --> Passport: " + passportsList);
      System.out.println("NID: " + NID + " --> Passport: " + passportsList);
    }
    printWriter.close();
  }
}
