package OOP.undervisning;

public class Person {

    //Field
    private String name;
    private Integer age;
    private Gender gender;

    public Person(String n, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
        "Age: " + age + "\n" +
        "Gender: " + gender + "\n";
    }
}
