import java.util.Random;
import java.util.Scanner;

public class GenerateRandomPassportInfo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] firstName = {"Adam", "Ahad", "Bashir", "Irfan", "Faruk", "Emran", "Abid", "Adnan", "Amir", "Amjad",
      "Anas", "Arif", "Anwar", "Ashraf", "Bilal", "Bakr", "Bashar", "Dawud", "Eisa", "farhan",
      "Faisal", "Fuad", "Atik", "Bahadur", "Hanif", "Hafiz", "Habib", "Haider", "Hossain", "Irfan",
      "Jihad", "Ismail", "Jafar", "Jalal", "Jamal", "Jihad", "Jamil", "Junaid", "Kamal", "Karim",
      "Kamil", "Karam", "Khalid", "Khalil", "Labib", "Luqman", "Mahadi", "Mahir", "Mahabub", "Majid",
    };
    String[] lastName = {"Hadi", "Bhuiyan", "Khan", "Chowdhuri", "Talukdar", "Ahmed", "Uddin", "Amin", "Ali", "Mahmud",
      "Majid", "Malik", "Mansoor", "Miftah", "Mishbah", "Mumtaaz", "Mubarak", "Mujeeb", "Munim", "Murad",
      "Munim", "Muntasir", "Murshid", "Muntasir", "Muslim", "Musa", "Nadeem", "Nadir", "Nakib", "Nasser",
      "Omar", "Osama", "Omayer", "Rafiq", "Rashid", "Salam", "Salman", "Saleh", "Salim", "Saado",
      "Sajid", "Saafi", "Saad", "Sarif", "Talha", "Tahir", "Tamim", "Tareeq", "Tawsif", "Umair"
    };
    PassportInfo[] passportInfo = new PassportInfo[15];
    
    final Random random = new Random();
    
    PassportInfo[] passportInfos = new PassportInfo[15];
    for (int i = 0; i < 15; i++) {
      passportInfos[i] = PassportInfo.Builder();
      int index = random.nextInt(50);
      
      passportInfos[i].setFirstName(firstName[index]);
      passportInfos[i].setLastName(lastName[index]);
      
      int day = random.nextInt(30) + 1;
      int month = random.nextInt(12) + 1;
      int year = random.nextInt(75) + 1921;
      
      passportInfos[i].setDateOfBirth(new dateInfo(day, month, year));
      
      StringBuilder stringBuilder = new StringBuilder();
      
      int indexNumber = random.nextInt(9) + 1;
      stringBuilder.append(indexNumber);
      
      for (int j = 0; j < 10; j++) {
        indexNumber = random.nextInt(10);
        stringBuilder.append(indexNumber);
      }
      
      passportInfos[i].setNIDNumber(stringBuilder.toString());
      passportInfos[i].setPicture(new PassportInfo.Picture());
    }
    
    System.out.println("Generated 15 NIDs: ");
    
    for (int i = 0; i < 15; i++) {
      System.out.print(passportInfos[i].getNIDNumber() + ", ");
    }
    
    System.out.print("\n\nEnter NID: ");
    String nid = scanner.nextLine();
    
    boolean search = false;
    
    for (int i = 0; i < 15; i++) {
      if (passportInfos[i].getNIDNumber().equals(nid)) {
        System.out.println(passportInfos[i]);
        search = true;
      }
    }
    
    if (!search) {
      System.out.println("Searched NID Not found");
    }
  }
}
