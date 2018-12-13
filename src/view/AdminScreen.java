package view;

/**
 *
 * @author sally
 */
public class AdminScreen extends BaseScreen {

  @Override
  public void display(String username) {
    System.out.println("Welcome " + username + "\n"
            + "type 1 to student operation \n"
            + "type 2 to view all courses \n"
            + "type 3 to View student that register under specific course for its basic information and course mark/grade \n"
            + "type 4 to mark score/grade for each student and course \n"
            + "type 0 to logout");
  }

  @Override
  public void selection(int num) {

    switch (num) {
      case 1:
        System.out.println("type 1 to view all student \n"
                + "type 2 to add student");
        break;
      case 2:
        System.out.println("type 1 to view all teacher \n"
                + "type 2 to Add teacher");
        break;
      case 3:
        System.out.println("type 1 to view all course \n"
                + "type 2 to Add course for a teacher");
        break;
      case 4:
        System.out.println("Admin operation");
        break;
      default:
        System.out.println("Please input the right operation");
        break;
    }
  }
}