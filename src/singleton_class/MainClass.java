package singleton_class;

public class MainClass {
    public static void main(String[] args) {
        AppConfig configObject1 = AppConfig.getInstance();
        configObject1.show();

        AppConfig configObject2 = AppConfig.getInstance();
        configObject2.show();
    }
}
