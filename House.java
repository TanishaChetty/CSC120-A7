import java.util.ArrayList;


/* This is a stub for the House class */


public class House extends Building {
  // Attributes
  private ArrayList<Student> residents;
  private Boolean hasDiningRoom;

/**
  * Constructor for House
  * @param name name of House
  * @param address address of House
  * @param nFloors number of floors in House
  * @param hasDiningRoom whether or not the House has a dining room
  */  
public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
  * Accessor to see if the House has a dining room
  * @return boolean to see if the house has a dining room
  */
  public Boolean getHasDiningRoom(){
    return this.hasDiningRoom;
    }

  /**
  * Accessor to see how many people live in the House
  * @return the number of residents in the house
  */
  public Integer nResidents() {
    return this.residents.size();
  }

  /**
  * Updates the residents when someone moves in
  * @param s the student
  */
  public void moveIn(Student s){
    this.residents.add(s);
  }

  /**
  * Checks if someone is a resident
  * @param s the student
  * @return boolean indicating if student is a resident
  */
  public boolean isResident(Student s){
    if (residents.contains (s)){
      return true;
    } else {
      return false;
    }

  }



  /**
  * Updates the residents when someone moves out
  * @param s the student
  * @return returns the student
  */
  public Student moveOut(Student s){
    if (residents.contains(s)){
      this.residents.remove(s);
    }
    return (s);
  }

  




  public static void main(String[] args) {
    new House("Talbot House", "25 Prospect Street", 4, false);
  }

}

