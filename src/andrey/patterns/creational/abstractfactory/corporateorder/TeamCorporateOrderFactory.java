package andrey.patterns.creational.abstractfactory.corporateorder;

import andrey.patterns.creational.abstractfactory.Accountant;
import andrey.patterns.creational.abstractfactory.DeliveryMan;
import andrey.patterns.creational.abstractfactory.Operator;
import andrey.patterns.creational.abstractfactory.TeamFactory;

public class TeamCorporateOrderFactory implements TeamFactory {
    @Override
    public Accountant getAccountant() {
        return new AccountantForCorporateOrder();
    }

    @Override
    public Operator getOperator() {
        return new OperatorForCorporateOrder();
    }

    @Override
    public DeliveryMan getDeliveryMan() {
        return new MotoDeliveryMan();
    }
}
