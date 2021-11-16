package andrey.patterns.structural.flyweight;

public class MotoDeliveryMan implements DeliveryMan{
    @Override
    public void deliverCargo() {
        System.out.println("delivery by motoBike...");
    }
}
