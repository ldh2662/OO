package edu.vccs.ldh2662.oo.lab;

/**
 * Constructors, setters, and getters for student info
 * 1/22/2018
 * @author Lucas Helms
 * @author Christian Le
 */
public class Person
{
   String firstName; // first name of person
   String lastName; // last name of person

   /**
    * default constructor
    */
   public Person(){
   }

   /**
    * 2 arg constructor
    * @param firstName first name of person
    * @param lastName last name of person
    */
   public Person(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   /**
    * gets first name of person
    * @return first name of person
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * sets first name of person
    * @param firstName first name of person
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * sets last name of person
    *@param lastName last name of person
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * gets last name of person
    * @return last name of person
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * prints out person info
    * @return a string of person info
    */
   @Override
   public String toString() {
      return "Person{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          '}';
   }
}
