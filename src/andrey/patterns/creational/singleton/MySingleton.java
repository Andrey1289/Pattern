package andrey.patterns.creational.singleton;

public class MySingleton {
    private static  MySingleton instance;
    public String value;

    private MySingleton(String value){
        this.value = value;
    }
    public static synchronized MySingleton getInstance(String value){
        if(instance == null){
            instance = new MySingleton(value);
        }
        return instance;
    }
}
