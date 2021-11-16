package andrey.patterns.structural.flyweight;

public class BicycleDeliveryMan implements DeliveryMan{
    @Override
    public void deliverCargo() {
        System.out.println("delivery by bike...");
    }
}
