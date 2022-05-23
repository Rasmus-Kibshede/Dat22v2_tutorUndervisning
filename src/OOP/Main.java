package OOP;

public class Main {
  public static void main(String[] args) {


    //----------------------------- Parse int to String
    /*
    String myString = "1";
    int myInt = 2;

    myString = Integer.toString(myInt); // Uses the java Integer class to parse the value
    //myString = myInt + ""; //Cheat

    System.out.println(myString);*/


    //----------------------------- Parse string to int
    /*String myString = "1";
    int myInt;

    myInt = Integer.parseInt(myString); // Uses the java Integer class to parse the value
    //myInt = Integer.parseInt("hej");

    System.out.println(i);*/



    //----------------------------- Type casting
    //Type casting is when you assign a value of one primitive data type to another type.

    // Widening Casting
    /*int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println("Int = " + myInt);
    System.out.println("Double = " + myDouble);
*/

    // Narrowing Casting
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println("Double = " + myDouble);
    System.out.println("Int = " + myInt);




  }
}
