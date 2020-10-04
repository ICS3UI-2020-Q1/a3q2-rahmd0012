import java.util.Scanner;

/**
 * a program to determine which animal the user thinks of
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // does the animal have feathers
    System.out.println("Does your animal have feathers? (yes/no)");
    String feathers = input.nextLine();

    if(feathers.equals("yes")) {
      // animal has feathers
      // ask if it can swim
      System.out.println("Does the animal swim? (yes/no)");
      String doesitSwim = input.nextLine();

      // can it swim
      if(doesitSwim.equals("yes")){
        System.out.println("This is a duck");
      } else if(doesitSwim.equals("no")) {
        System.out.println("This is a Hen");
      }
      } else {
        // animal doesn't have feathers
        // does the animal have legs
        System.out.println("Does the animal have legs? (yes/no)");
        String doesLegs = input.nextLine();


       if(doesLegs.equals("yes")) {
        System.out.println("This is a Lizard");
      } else if(doesLegs.equals("no")) {
        System.out.println("This is a Snake");
      }
    }
    
  }
}
