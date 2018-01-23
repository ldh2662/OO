package edu.vccs.ldh2662.oo.lab;

/**
 * Constructors, setters, and getters for college person
 * 1/22/2018
 * @author Lucas Helms
 * @author Christian Le
 */
public abstract class CollegePerson extends Person
{
   String ID; // ID of students

   /**
    * default constructor
    */
   public CollegePerson() {
   }

   /**
    * constructor for College persons
    * @param ID ID of student
    */
   public CollegePerson(String ID) {
      this.ID = ID;
   }

   /**
    * 3 arg constructor for college person
    * @param firstName first name of college person
    * @param lastName last name of college person
    * @param ID ID of college person
    */
   public CollegePerson(String firstName, String lastName, String ID){
      super(firstName,lastName);
      this.ID = ID;
   }

   /**
    * gets the ID of student
    * @return the string ID
    */
   public String getID() {
      return ID;
   }

   /**
    * sets the ID of student
    * @param ID passes ID as a string
    */
   public void setID(String ID) {
      this.ID = ID;
   }

   /**
    * prints out person info
    * @return a string of person info
    */
   @Override
   public String toString() {
      return "CollegePerson{" +
          "ID='" + ID + '\'' + '}' +
          super.toString();
   }
}
