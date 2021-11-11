package andrey.patterns.creational.abstractfactory.homeorder;

import andrey.patterns.creational.abstractfactory.Accountant;

public class AccountantForHomeOrder implements Accountant {

    @Override
    public void countOrders() {
        System.out.println("count without discount....");
    }
}
