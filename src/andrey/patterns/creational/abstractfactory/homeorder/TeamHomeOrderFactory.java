package andrey.patterns.creational.abstractfactory.homeorder;

import andrey.patterns.creational.abstractfactory.Accountant;
import andrey.patterns.creational.abstractfactory.DeliveryMan;
import andrey.patterns.creational.abstractfactory.Operator;
import andrey.patterns.creational.abstractfactory.TeamFactory;

public class TeamHomeOrderFactory implements TeamFactory {

    @Override
    public Accountant getAccountant() {
        return new AccountantForHomeOrder();
    }

    @Override
    public Operator getOperator() {
        return new OperatorForHomeOrder();
    }

    @Override
    public DeliveryMan getDeliveryMan() {
        return new BicycleDeliveryMan();
    }
}
