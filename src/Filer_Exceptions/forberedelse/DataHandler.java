package Filer_Exceptions.forberedelse;

import java.io.*;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataHandler {

  private File file;

  private ArrayList<Animal> animals = new ArrayList<>();

  public DataHandler(String filePath) {
    this.file = new File(filePath);
  }

  //------------------------ Save an Animal ------------------------

  public void writeAnimalToFileWith_PrintStream(Animal animal, boolean overrideFile) {
    try {

      //Can't control flush aka overrides file
      PrintStream printStream = new PrintStream(file);

      //Can control flush aka can decide to override file
      //PrintStream printStream = new PrintStream(new FileOutputStream(file, !overrideFile));

      printStream.print(animal.getName());
      printStream.print(";");

      printStream.print(animal.getRace());
      printStream.print(";");

      printStream.print(animal.getAge());
      printStream.print("\n");

      printStream.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public void writeAnimalToFileWith_FileWriter(Animal animal, boolean overrideFile) {

    try {
      FileWriter fileWriter = new FileWriter(file, !overrideFile);

      fileWriter.append(animal.getName()).append(";");
      fileWriter.append(animal.getRace()).append(";");
      fileWriter.append(Integer.toString(animal.getAge())).append("\n");

      fileWriter.close();

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }



  //------------------------ Save all Animals ------------------------

  public void writeAllAnimalsToFileWith_PrintStream(boolean overrideFile) {

    try {

      //Can't control flush aka overrides file
      //PrintStream printStream = new PrintStream(file);

      //Can control flush aka can decide to override file
      PrintStream printStream = new PrintStream(new FileOutputStream(file, !overrideFile));

      for (Animal animal : animals) {
        printStream.print(animal.getName());
        printStream.print(";");

        printStream.print(animal.getRace());
        printStream.print(";");

        printStream.print(animal.getAge());
        printStream.print("\n");
      }

      printStream.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }


  }

  public void writeAllAnimalToFileWith_FileWriter(boolean overrideFile) {

    try {
      FileWriter fileWriter = new FileWriter(file, !overrideFile);

      for (Animal animal : animals) {
        fileWriter.append(animal.getName()).append(";");
        fileWriter.append(animal.getRace()).append(";");
        fileWriter.append(Integer.toString(animal.getAge())).append("\n");
      }

      fileWriter.close();

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }



  //------------------------ Load ------------------------

  public void loadFileWith_Delimiter() {
    try {
      Scanner scan = new Scanner(file);

      while (scan.hasNextLine()) {
        String line = scan.nextLine();

        Scanner lineScanner = new Scanner(line).useDelimiter(";");

        Animal animal = new Animal(lineScanner.next(), lineScanner.next(), lineScanner.nextInt());

        animals.add(animal);
      }

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public void loadFileWith_Split() {
    try {
      Scanner scan = new Scanner(file);

      while (scan.hasNextLine()) {
        String[] strings = scan.nextLine().split(";");

        Animal animal = new Animal(strings[0], strings[1], Integer.parseInt(strings[2]));

        animals.add(animal);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }



  //------------------------ Getter and Setters ------------------------

  public ArrayList<Animal> getAnimals() {
    return animals;
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }
}
