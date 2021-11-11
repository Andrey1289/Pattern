package andrey.patterns.creational.abstractfactory;

import andrey.patterns.creational.abstractfactory.corporateorder.TeamCorporateOrderFactory;

public class CorporateCustomer {
    public static void main(String[] args) {
        TeamFactory teamFactory = new TeamCorporateOrderFactory();

        DeliveryMan deliveryMan = teamFactory.getDeliveryMan();
        Operator operator = teamFactory.getOperator();
        Accountant accountant = teamFactory.getAccountant();

        operator.answerCalls();
        accountant.countOrders();
        deliveryMan.deliverCargo();

    }
}
