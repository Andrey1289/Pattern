package andrey.patterns.creational.abstractfactory.corporateorder;

import andrey.patterns.creational.abstractfactory.DeliveryMan;

public class MotoDeliveryMan implements DeliveryMan {
    @Override
    public void deliverCargo() {
        System.out.println("deliver by moto....");
    }
}
