package abstraction.abstract_classes;

public class RepairShop {

    public static void repair(Car car){
        System.out.println("Car Is Repaired.");
    }

    public static void main(String[] args) {
        Audi audi = new Audi();
        Volkswagen volkswagen = new Volkswagen();
        Lamborghini lamborghini = new Lamborghini();

        repair(audi);
        repair(volkswagen);
        repair(lamborghini);
    }
}
