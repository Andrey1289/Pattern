package andrey.patterns.structural.composite;

public class MotoDeliveryMan  implements DeliveryMan{
    @Override
    public void deliverCargo() {
        System.out.println("deliver by moto...");
    }
}
