package andrey.patterns.creational.factory;

public class Customer {
    public static void main(String[] args) {
        DeliveryManFactory deliveryManFactory = createDelivers("");

        DeliveryMan deliveryMan = deliveryManFactory.createCarrier();

        deliveryMan.deliverCargo();

    }
    static DeliveryManFactory createDelivers(String s){
        if(s.equalsIgnoreCase("fast")){
            return new MotoDeliveryManFactory();
        }if(s.equalsIgnoreCase("")){
            return new BicycleDeliveryManFactory();
        }else
            throw new RuntimeException();

    }
}
