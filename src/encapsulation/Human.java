package encapsulation;

public class Human {

    //Step-1: Making The Data Fields Private.
    private String name;
    private int age;

    //Step-2: Prepared Public Getters() & Setter() Methods To Read & Write Those Data Fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
