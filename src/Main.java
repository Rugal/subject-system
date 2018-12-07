
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sally
 */
public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("student"));
    ArrayList<Person> test = new ArrayList<Person>();
    while (fileScanner.hasNext()) {
      test.add(new Person(0, fileScanner.next(), fileScanner.next()));
    }
    do {
      System.out.println("Please input Username:");
      Scanner scanner = new Scanner(System.in);
      String Udata = scanner.next();
      System.out.println("Please input Passward:");
      String Pdata = scanner.next();
      if(verify(test, Udata, Pdata)){
        System.out.println("Welcome" + Udata);
        break;
      }
    } while (true);
  }

  public static boolean verify(ArrayList<Person> test,String udata, String pdata) {

    for (int i = 0; i < test.size(); ++i) {
      if (test.get(i).getUsername().equals(udata) && test.get(i).getPassword().equals(pdata)) {
        return true;
       
      }
    }
    return false;

  }

}
