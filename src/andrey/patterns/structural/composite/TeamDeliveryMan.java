package andrey.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamDeliveryMan {
    public List<DeliveryMan> deliveryMEN = new ArrayList<>();


    public void addDeliveryMan(DeliveryMan deliveryMan){
          deliveryMEN.add(deliveryMan);
    }
    public void removeDeliveryMan(DeliveryMan deliveryMan){
        deliveryMEN.remove(deliveryMan);
    }
    public void createDelivery(){
        System.out.println(" Team deliveryMan is created..");
        for(DeliveryMan d : deliveryMEN){
            d.deliverCargo();
        }
    }
}
