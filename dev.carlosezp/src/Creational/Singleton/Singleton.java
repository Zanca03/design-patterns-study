package Creational.Singleton;

public class Singleton {
    private static volatile Singleton instance; //Volatile for Thread Safe
    private String systemConfigs;

    private Singleton(String systemConfigs) { //Constructor needs to be private!
        this.systemConfigs = systemConfigs;
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) { //Thread Safe
                if (instance == null) //If don't exists instance of class, create a new
                    instance = new Singleton("Yours system configs!");
            }
        }
        return instance;
    }

    public String getSystemConfigs(){
        return systemConfigs;
    }
}
