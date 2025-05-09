/* This is a stub for the Library class */

import java.util.Hashtable;



public class Library extends Building {

  private Hashtable<String, Boolean> collection;


  /**
  * Constructor for Library
  * @param name name of Library
  * @param address address of Library
  * @param nFloors number of floors in Library
  */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<>();
    System.out.println("You have built a library: 📖");
  }


  /**
  * Adding a book to the library collection
  */
  public void addTitle (String title){
    collection.put(title, true);
   
  }

  /**
  * returns the title we removed
  * @param title the title of the book
  * @return the title, or tells us we can't do that
  */
  public String removeTitle (String title){
    if (collection.contains(title)){
      collection.remove(title, true);
      return title;
    } else {
      throw new UnsupportedOperationException("Oops you can't do that");

    }

  }

  /**
  * checking out a book
  * @param title the book
  */
  public void checkOut (String title){
    if (collection.contains(title)){
      collection.replace(title, true, false);
    } else {
      throw new UnsupportedOperationException("Oops you can't do that");
    }





  }

  /**
  * returning the book the the collection
  * @param title the title of the book
  */
  public void returnBook (String title){
    collection.replace(title, false, true);

  }

  /**
  * returns true if the title appears as a key in the Libary's collection, false otherwise
  * @param title the title of the book
  * @return boolean. if it works or not
  */
  public boolean containsTitle(String title){
    if (collection.contains(title)){
      return true;
    } else {
      return false;
    }

  }

  /**
  * returns true if the title is currently available, false otherwise
  * @param title the title of the book
  * @return boolean for if it works or not
  */
  public boolean isAvailable(String title){
    if (collection.get(title) == true){
      return true;
    } else {
      return false;
    }

  }

  /**
  * prints out the entire collection
  */
  public void printCollection(){
    System.out.println(collection.toString());

  }
   

  
    public static void main(String[] args) {
      new Library("Josten Library", "122 Green St", 2);
    }
  
  }