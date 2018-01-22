package edu.vccs.ldh2662.oo.lab;

/**
 * Constructors, setters, and getters for instructor info
 * 1/22/2018
 * @author Lucas Helms
 * @author Christian Le
 */
public class Instructor extends CollegePerson {

   String office; // office of the instructor

   /**
    * default constructor
    */
   public Instructor() {
   }

   /**
    * 1 arg constructor
    * @param office office of the instructor
    */
   public Instructor(String office) {
      this.office = office;
   }

   /**
    * 3 arg constructor
    * @param firstName first name of instructor
    * @param lastName last name of instructor
    * @param ID ID of instructor
    * @param office office number of intructor
    */
   public Instructor(String firstName, String lastName, String ID,
                     String office) {
      super(firstName,lastName,ID);
      this.office = office;

   }

   /**
    * gets office of instructor
    * @return office of instructor
    */
   public String getOffice() {
      return office;
   }

   /**
    * sets office of instructor
    * @param office office of instructor
    */
   public void setOffice(String office) {
      this.office = office;
   }

   /**
    * prints out instructor info
    * @return a string of instructor info
    */
   @Override
   public String toString() {
      return "Instructor{" +
          "office='" + office + '\'' +
          '}'+ super.toString();
   }
}
