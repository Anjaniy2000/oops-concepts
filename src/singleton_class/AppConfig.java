package singleton_class;

public class AppConfig {

    //Static Variable(Instance) Of Type AppConfig-Class.
    private static AppConfig configObject = null;

    //Private Constructor, To Prevent Instantiate Of AppConfig-Class Type From Other Classes.
    private AppConfig(){
    }

    //Public Static Getter() Method, Returns A Static Instance Of AppConfig-Class Type.
    public static AppConfig getInstance(){
        if(configObject == null) return configObject = new AppConfig();
        else{
            return configObject;
        }
    }

    public void show(){
        System.out.println("Inside AppConfig Singleton Class, " + "Singleton Object =  " + configObject);
    }
}
