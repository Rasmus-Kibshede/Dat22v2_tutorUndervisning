package comparable_comparator.undervisning;

public class Car implements Comparable<Car> {

    private String model;
    private String brand;
    private FuelType fuelType;
    private Integer age;


    public Car(String model, String brand, FuelType fuelType, int age) {
        this.model = model;
        this.brand = brand;
        this.fuelType = fuelType;
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
        //return age.compareTo(o.age);
        //return d.compareTo(o.d);
    }

    public Integer getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nmodel='" + model + '\'' +
                "\nbrand='" + brand + '\'' +
                "\nfuelType=" + fuelType +
                "\nage=" + age +
                "\n}\n";
    }


}
