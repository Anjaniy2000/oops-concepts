package encapsulation;

public class DogObjects {
    public static void main(String[] args) {

        Dog toby = new Dog();
        toby.setName("Tobey");
        toby.setAge(13);
        toby.setBreed("Bulldog");

        System.out.println("Hi, I'm " + toby.getName() + ", I'm " + toby.getAge() + " Years Old.");
        System.out.println("My Breed Is: " + toby.getBreed());
    }
}
