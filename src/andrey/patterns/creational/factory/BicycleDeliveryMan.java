package andrey.patterns.creational.factory;

public class BicycleDeliveryMan implements DeliveryMan {
    @Override
    public void deliverCargo() {
        System.out.println("Delivery by bike...");
    }
}
