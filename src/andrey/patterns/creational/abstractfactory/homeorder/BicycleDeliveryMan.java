package andrey.patterns.creational.abstractfactory.homeorder;

import andrey.patterns.creational.abstractfactory.DeliveryMan;

public class BicycleDeliveryMan implements DeliveryMan {
    @Override
    public void deliverCargo() {
        System.out.println("deliver by bike....");
    }
}
