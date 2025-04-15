import java.util.HashMap;
import java.util.Map;
class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 
    //First making the hasmap
    Map<String, Integer> creditHours = new HashMap<>(); 
    //Then putting in the valules to credit hours
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);
    //Then checking checking for the keys, and prints out true if found, false if not
    System.out.println(creditHours.containsKey("IT-1025"));
    System.out.println(creditHours.containsKey("IT-2110"));
    //Then print all values in the map 
    System.out.println("Credit hour values: "); 
    for(Integer value: creditHours.values()) {
      System.out.print(value + ", "); 
    }
    System.out.println(); 
    // Then remove IT-2030 & IT-1150
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");
    //Lastly print all values again..l
    System.out.println("Re-printing Credit hour values after removing:  "); 
    for(Integer value: creditHours.values()) {
      System.out.print(value + ", "); 
    }
  }
}