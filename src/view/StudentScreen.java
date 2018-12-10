package view;

/**
 *
 * @author sally
 */
public class StudentScreen extends BaseScreen {

  @Override
  public void display(String username) {
    System.out.println("Welcome " + username + "\n"
            + "type 1 to register an existing course \n"
            + "type 2 to Browse all registerable courses \n"
            + "type 3 to View registered courses \n"
            + "type 0 to logout");
  }

  @Override
  public void selection(int num) {
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
  }
}
