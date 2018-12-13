package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sally
 */
public class WritingToFiles {
  public static void addStudent(String username, String password) throws IOException {
    File file = new File("people");
    FileWriter fw = new FileWriter(file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.println("\n student" + " " + username + " " + password);
    pw.close();
  }
}
