
import model.Person;
import model.WritingToFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner fileScanner = new Scanner(new File("people"));
    ArrayList<Person> test = new ArrayList<>();
    while (fileScanner.hasNext()) {
      test.add(new Person(0, fileScanner.next(), fileScanner.next(), fileScanner.next()));
    }
    Scanner scanner = new Scanner(System.in);
    String Tdata;
    String Udata;
    String Pdata;
    int numOfType;
    int numOfOperation;

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
      numOfType = scanner.nextInt();
      screen.selection(numOfType);
      break;

    } while (numOfType != 0);

    if (Tdata.equals("admin")) {
      numOfOperation = scanner.nextInt();
      switch (numOfOperation) {
        case 1:
          viewSt(test);
          break;
        case 2:
          String u;
          String p;
          do {
            System.out.println("please add student username");
            u = scanner.next();
            System.out.println("please add student passward");
            p = scanner.next();
            if (verifyStudent(test, "student", u)) {
              System.out.println("student has already exists");
            } else {
              break;
            }
          } while (true);
          WritingToFiles.addStudent(u, p);
          break;

        default:
          System.out.println("Please input the right operation");
          break;
      }
    }
  }

  public static void viewSt(ArrayList<Person> test) {
    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getType().equals("student")) {
        System.out.println((test.get(i).getUsername() + test.get(i).getPassword()));
      }
    }
  }

  public static boolean verify(ArrayList<Person> test, String tdata, String udata, String pdata) {
    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getType().equals(tdata) && test.get(i).getUsername().equals(udata) && test.get(i).getPassword().equals(pdata)) {
        return true;
      }
    }
    return false;
  }

  public static boolean verifyStudent(ArrayList<Person> test, String tdata, String udata) {
    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getType().equals(tdata) && test.get(i).getUsername().equals(udata)) {
        return true;
      }
    }
    return false;
  }
}
