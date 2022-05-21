package objects;

import classes.Human;

public class HumanObjects {
    public static void main(String[] args) {
        Human jay = new Human();
        jay.name = "Jay Shah";
        jay.age = 30;

        jay.introduction();
        jay.eat();
        jay.sleep();
    }
}
