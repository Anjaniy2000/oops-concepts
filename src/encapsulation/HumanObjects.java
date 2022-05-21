package encapsulation;

public class HumanObjects {
    public static void main(String[] args) {

        Human toby = new Human();
        toby.setName("Tobey Maguire");
        toby.setAge(40);

        System.out.println("Hi, I'm " + toby.getName() + ", I'm " + toby.getAge() + " Years Old.");
    }
}
