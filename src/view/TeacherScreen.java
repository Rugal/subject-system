package view;

/**
 *
 * @author sally
 */
public class TeacherScreen extends BaseScreen {

  @Override
  public void display(String username) {
    System.out.println("Welcome " + username + "\n"
            + "type 1 to create new course \n"
            + "type 2 to view all courses \n"
            + "type 3 to View student that register under specific course for its basic information and course mark/grade \n"
            + "type 4 to mark score/grade for each student and course \n"
            + "type 0 to logout");
  }

  @Override
  public void selection(int num) {
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
}
