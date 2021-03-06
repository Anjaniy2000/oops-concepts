package encapsulation;

public class Dog {

    //Step-1: Making The Data Fields Private.
    private String name;
    private String breed;
    private int age;

    //Step-2: Prepared Public Getters() & Setter() Methods To Read & Write Those Data Fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
