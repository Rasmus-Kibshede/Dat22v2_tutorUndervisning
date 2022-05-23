package comparable_comparator.myVersion;

import java.util.Comparator;

public class SuperComperator implements Comparator<Car> {

  private String sortOn;
  private String sortDirection;

  public SuperComperator(String sortOn, String sortDirection) {
    this.sortOn = sortOn;
    this.sortDirection = sortDirection;
  }

  @Override
  public int compare(Car o1, Car o2) {
    int result = switch (sortOn.toLowerCase()) {
      case "brand" -> o1.getBrand().compareTo(o2.getBrand());
      case "age" -> o1.getAge().compareTo(o2.getAge());
      case "model" -> o1.getModel().compareTo(o2.getModel());
      case "fuel" -> o1.getFuelType().compareTo(o2.getFuelType());
      default -> o1.getBrand().compareTo(o2.getBrand());
    };

    if (sortDirection.equals("DESC")) {
      result = result * -1;
    }

    return result;
  }

  public void setSortDirection(String sortDirection) {
    if (sortDirection.equals("TOGGLE")) {
      if (this.sortDirection.equals("ASC")) {
        this.sortDirection = "DESC";
      } else {
        this.sortDirection = "ASC";
      }
    } else {
      this.sortDirection = sortDirection;
    }
  }

  public void setSortOn(String sortOn) {
    this.sortOn = sortOn;
  }
}
