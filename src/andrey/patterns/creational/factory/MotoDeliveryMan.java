package andrey.patterns.creational.factory;

public class MotoDeliveryMan implements DeliveryMan{
    @Override
    public void deliverCargo() {
        System.out.println("delivery by moto...");
    }
}
