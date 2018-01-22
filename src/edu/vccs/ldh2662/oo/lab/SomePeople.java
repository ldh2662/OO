package edu.vccs.ldh2662.oo.lab;

/**
 * Prints out all information on the instructor and students
 * 1/22/2018
 * @author Lucas Helms
 * @author Christian Le
 */
public class SomePeople {
   public static void main(String[] args) {
      CollegePerson[] collegePersons = new CollegePerson[3]; // creates the array of 3 objects
      collegePersons[0] = new Instructor("Christian", "Le", "7897897",
              "f107"); // puts instructor in the array
      collegePersons[1] = new Student("Lucas", "Helms", "78854",
              "CSC"); // puts student in the array
      collegePersons[2] = new Student("John", "Maxfield", "79878",
              "English"); // puts student in the array
      for (CollegePerson collegePerson : collegePersons) {
         System.out.println(collegePerson);
      }
   }
}
