/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmvc;

/**
 *
 * @author Daso
 */
public class StudentMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }
      private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
    }

