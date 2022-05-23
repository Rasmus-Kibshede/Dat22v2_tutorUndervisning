package OOP;

import java.util.ArrayList;
import java.util.List;

public class Eksamen {
  public static void main(String[] args) {

    //----------------------------------- (1)
    // What will bee printed?

    /*List<Integer> lst = new ArrayList<>();
    lst.add(1);
    for (int i = 0; i < lst.size(); i++) {
      System.out.println(lst.get(i).getClass().getName());
    }*/

    //----------------------------------- (2)
    // Write a function that converts a string to an Integer (return int).
    // In 1 line of code.
    /*int i = convertStringToInt("1");
    System.out.println(i);*/


    //----------------------------------- (3)
    //Why does this code not compile ?

    /*
    public class Student {
      public String name;

      public Student(String name) {
        this.name = name;
      }

      public static void main(String[] args) {
        Student std = new Student();
      }
    }
    */


    //----------------------------------- (4)
    //Why does this code not compile ?
    /*
    public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
        super();
    }

    public static void main(String[] args) {
        Student std = new Student("hans");
    }
}
*/

    //----------------------------------- (5)
    //What is the use of a final modifier on a method ?
    //What is the use of a public modifier on a method ?
    //What is the use of a private modifier on a method ?


    //----------------------------------- (6)
    //What are static variables and methods ?


    //----------------------------------- (7)
    //Can a primitive data type have the value null?


    //----------------------------------- (8)
    //This is legal code in Java?

    /*

   public int sum(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
  */

    //----------------------------------- (9)
    //Identify the primitives, references, classes and objects in the following Java code
    /*

    double d = 5.0;
    int i[] = {1,2,3,4};
    LinkedList<Double> l = new LinkedList<Double>();
    Double k = new Double();
    Tree t;
    float f;
    Computer c = null;

    */


  }


  public static int convertStringToInt(String s) {
    return Integer.parseInt(s);
  }

}
