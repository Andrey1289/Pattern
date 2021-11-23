package andrey.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> sportItems) {
        System.out.println("Hollow " + name + "\n we have some interesting \n" + sportItems
        +"\n======================================\n");
    }
}
