package andrey.patterns.creational.factory;

public class BicycleDeliveryManFactory implements DeliveryManFactory{
    @Override
    public DeliveryMan createCarrier() {
        return new BicycleDeliveryMan();
    }
}
