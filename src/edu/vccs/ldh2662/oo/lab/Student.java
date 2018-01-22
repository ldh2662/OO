package edu.vccs.ldh2662.oo.lab;

/**
 * Constructors, setters, and getters for student major
 * 1/22/2018
 * @author Lucas Helms
 * @author Christian Le
 */
public class Student extends CollegePerson
{
   String major; // major of student

   /**
    * default constructor
    */
   public Student(){
   }

   /**
    * 1 arg constructor
    * @param major major of student
    */
   public Student(String major) {
      this.major = major;
   }

   /**
    * 4 arg constructor
    * @param firstName first name of student
    * @param lastName last name of student
    * @param ID ID of student
    * @param major major of student
    */
   public Student(String firstName, String lastName,
                  String ID, String major){

      super(firstName, lastName , ID);
      this.major = major;
   }

   /**
    * gets major
    * @return major of student
    */
   public String getMajor() {
      return major;
   }

   /**
    * sets major of student
    * @param major major of student
    */
   public void setMajor(String major) {
      this.major = major;
   }

   /**
    * prints out student info
    * @return string of student info
    */
   @Override
   public String toString() {
      return "Student{" +
          "major='" + major + '\'' +
          '}' + super.toString();
   }
}
