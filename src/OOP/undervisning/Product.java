package OOP.undervisning;

public class Product {

    private static int id;
    private String name;

    public Product(String name) {
        this.name = name;
        idCount();
    }

    public void idCount(){
        id++;
    }


}
