package Filer_Exceptions.forberedelse;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }


  public void run() {

    DataHandler dataHandler = new DataHandler("src/Filer_Exceptions/forberedelse/data.csv");

    Animal animal1 = new Animal("Mette", "Dog", 12);
    Animal animal2 = new Animal("Hans", "Cat", 2);
    Animal animal3 = new Animal("Peter", "Duck", 4);
    /*dataHandler.addAnimal(animal1);
    dataHandler.addAnimal(animal2);
    dataHandler.addAnimal(animal3);*/

    //------------ Write an animal to file ------------

    //PrintStream
    //dataHandler.writeAnimalToFileWith_PrintStream(animal1, true);

    //FileWriter
    //dataHandler.writeAnimalToFileWith_FileWriter(animal1, true);


    //------------ Write all animals to file ------------

    //PrintStream
    //dataHandler.writeAllAnimalsToFileWith_PrintStream(true);

    //FileWriter
    //dataHandler.writeAnimalToFileWith_FileWriter(animal1, true);


    //------------ Load from file ------------

    //Delimiter
    dataHandler.loadFileWith_Delimiter();


    //Split
    //dataHandler.loadFileWith_Split();

    System.out.println(dataHandler.getAnimals());


    //Own exception
    /*try {
      throw new TestException("Test");
    } catch (TestException e) {
      System.out.println(e.getMessage());
    }*/

  }

}
