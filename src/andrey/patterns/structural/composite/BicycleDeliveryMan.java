package andrey.patterns.structural.composite;

public class BicycleDeliveryMan implements DeliveryMan{
    @Override
    public void deliverCargo() {
        System.out.println("deliver by bike...");
    }
}
