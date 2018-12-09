
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sally
 */
public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("people"));
    ArrayList<Person> test = new ArrayList<>();
    while (fileScanner.hasNext()) {
      test.add(new Person(0, fileScanner.next(), fileScanner.next(), fileScanner.next()));
    }
    Scanner scanner = new Scanner(System.in);
    String Tdata;
    do {
      System.out.println("Please input Username:");
      String Udata = scanner.next();
      System.out.println("Please input Passward:");
      String Pdata = scanner.next();
      System.out.println("Please input type:");
      Tdata = scanner.next();
      if (verify(test, Tdata, Udata, Pdata)) {

        if (Tdata.equals("student")) {
          System.out.println("Welcome " + Udata + "\n"
                  + "type 1 to register an existing course \n"
                  + "type 2 to Browse all registerable courses \n"
                  + "type 3 to View registered courses \n"
                  + "type 0 to logout");
        } else if (Tdata.equals("teacher")) {
          System.out.println("Welcome " + Udata + "\n"
                  + "type 1 to create new course \n"
                  + "type 2 to view all courses \n"
                  + "type 3 to View student that register under specific course for its basic information and course mark/grade \n"
                  + "type 4 to mark score/grade for each student and course \n"
                  + "type 0 to logout");
        }
        break;
      }

      System.out.println("Login credential mismatch");

    } while (true);

    int num;

    do {
      num = scanner.nextInt();
      if (Tdata.equals("student")) {
        switch (num) {
          case 1:
            System.out.println("You can register an existing course");
            break;
          case 2:
            System.out.println("you can Browse all registerable courses");
            break;
          case 3:
            System.out.println("You can View registered courses below");
            break;
          default:
            System.out.println("Please input the right operation");
            break;
        }

      } else if (Tdata.equals("teacher")) {

        switch (num) {
          case 1:
            System.out.println("You can create new coursee");
            break;
          case 2:
            System.out.println("you can Biew all courses");
            break;
          case 3:
            System.out.println("You can view student that register under specific course for its basic information and course mark/grade");
            break;
          case 4:
            System.out.println("You can mark score/grade for each student and course");
            break;
          default:
            System.out.println("Please input the right operation");
            break;
        }

      }

    } while (num != 0);

    System.out.println("You have log out");
  }

  public static boolean verify(ArrayList<Person> test, String tdata, String udata, String pdata) {
    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getType().equals(tdata) && test.get(i).getUsername().equals(udata) && test.get(i).getPassword().equals(pdata)) {
        return true;
      }
    }
    return false;
  }
}
