package andrey.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryDeliveryMan {
    private static final Map<String, DeliveryMan> deliveryMan =new HashMap<>();

    public  DeliveryMan getDeliveryManBySpeedy(String speed){
        DeliveryMan delivery = deliveryMan.get(speed);
        if(delivery == null){
            switch (speed){
                case "fast" :
                    System.out.println("Hiring deliveryMan on MotoBike");
               delivery = new MotoDeliveryMan();
                break;
                     case "noFast":
                         System.out.println("Hiring deliveryMan on Bike");
                       delivery= new BicycleDeliveryMan();
                        break;
            }
            deliveryMan.put(speed,delivery);
        }
        return delivery;

    }
}
