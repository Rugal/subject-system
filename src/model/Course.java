package model;

/**
 *
 * @author sally
 */
public class Course {

  private int courseNumber;
  private String courseName;

  public Course(int courseNumber, String courseName) {
    this.courseNumber = courseNumber;
    this.courseName = courseName;
  }

  public int getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(int courseNumber) {
    this.courseNumber = courseNumber;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }



}
