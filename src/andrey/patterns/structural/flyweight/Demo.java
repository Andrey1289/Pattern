package andrey.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        FactoryDeliveryMan factoryDeliveryMan = new FactoryDeliveryMan();

        List<DeliveryMan> deliveryManList = new ArrayList<>();

        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("fast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("fast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("fast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("fast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("noFast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("noFast"));
        deliveryManList.add(factoryDeliveryMan.getDeliveryManBySpeedy("noFast"));

        for (DeliveryMan deliveryMan : deliveryManList) {
             deliveryMan.deliverCargo();
        }

    }
}
