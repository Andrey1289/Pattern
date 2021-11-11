package andrey.patterns.creational.abstractfactory.corporateorder;

import andrey.patterns.creational.abstractfactory.Accountant;

public class AccountantForCorporateOrder implements Accountant {
    @Override
    public void countOrders() {
        System.out.println("Count orders with discount...");
    }
}
