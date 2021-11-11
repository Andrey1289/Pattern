package andrey.patterns.creational.factory;

public class MotoDeliveryManFactory implements DeliveryManFactory{
    @Override
    public DeliveryMan createCarrier() {
        return new MotoDeliveryMan();
    }
}
