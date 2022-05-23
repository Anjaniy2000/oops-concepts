package keywords;

public class Super {
    public static void main(String[] args) {

        Y y = new Y("Jay Shah");
        y.Show();

    }
}

class X{
    public String name;

    public X(String name){
        this.name = name;
        System.out.println("Inside The Parent Constructor.");
    }

    public void Show(){
        System.out.println("Inside The Parent Class, And Name = " + this.name + ".");
    }
}

class Y extends X{

    public Y(String name) {
        super(name);
        System.out.println("Inside The Child Constructor.");
    }

    public void Show(){
        super.Show();
        System.out.println("Inside The Child Class.");
    }

}
