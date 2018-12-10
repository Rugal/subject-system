
import model.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import view.AdminScreen;
import view.BaseScreen;
import view.StudentScreen;
import view.TeacherScreen;

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
    String Udata;
    String Pdata;
    int num;

    do {
      System.out.println("Please input Username:");
      Udata = scanner.next();
      System.out.println("Please input Passward:");
      Pdata = scanner.next();
      System.out.println("Please input type:");
      Tdata = scanner.next();

      if (verify(test, Tdata, Udata, Pdata)) {
        break;
      }
      System.out.println("Please input the right operation");
    } while (true);

    BaseScreen screen = null;
    switch (Tdata) {
      case "student":
        screen = new StudentScreen();
        break;
      case "teacher":
        screen = new TeacherScreen();
        break;
      case "admin":
        screen = new AdminScreen();
        break;
      default:
        System.out.println("Please input the right operation");
        break;
    }
    screen.display(Udata);

    do {
      num = scanner.nextInt();
      screen.selection(num);
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
