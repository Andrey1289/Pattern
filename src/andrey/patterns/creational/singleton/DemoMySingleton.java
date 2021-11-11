package andrey.patterns.creational.singleton;

public class DemoMySingleton {
    public static void main(String[] args) {
     MySingleton mySingleton1 = MySingleton.getInstance("Foo");
     MySingleton mySingleton2 = MySingleton.getInstance("Bar");

        System.out.println(mySingleton1.value);
        System.out.println(mySingleton2.value);
    }
}
