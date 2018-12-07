
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sally
 */
public class Teacher extends Person {

  
  
  private ArrayList<Course> CourseList;
  

  public Teacher(int number, String username, String password) {
    super(number, username, password);
    this.CourseList = new ArrayList<Course>();
  }



  public boolean addCourse(Course course) {
    if (course == null || CourseList.contains(course)) {
      return false;
    }
    CourseList.add(course);
    return true;
  }

  

}
