
/**
 *
 * @author sally
 */
public class Person {

  protected String username;
  protected String password;
  protected int number;

  // Basically anything that makes sense for a student.
  public Person(int number, String username, String password) {
    this.number = number;
    this.username = username;
    this.password = password;

  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
