
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
    Scanner fileScanner = new Scanner(new File("student"));
    ArrayList<Person> test = new ArrayList<>();
    while (fileScanner.hasNext()) {
      test.add(new Person(0, fileScanner.next(), fileScanner.next()));
    }
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Please input Username:");
      String Udata = scanner.next();
      System.out.println("Please input Passward:");
      String Pdata = scanner.next();
      if (verify(test, Udata, Pdata)) {
        System.out.println("Welcome " + Udata + "\n"
                + "type 1 to register an existing course \n "
                + "type 2 to Browse all registerable courses \n"
                + "type 3 to View registered courses \n"
                + "type 0 to logout");
        break;
      }
      System.out.println("Login credential mismatch");

    } while (true);

    int num;
    do {
      num = scanner.nextInt();
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
    } while (num != 0);
    System.out.println("You have log out");
  }

  public static boolean verify(ArrayList<Person> test, String udata, String pdata) {
    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getUsername().equals(udata) && test.get(i).getPassword().equals(pdata)) {
        return true;
      }
    }
    return false;
  }
}
