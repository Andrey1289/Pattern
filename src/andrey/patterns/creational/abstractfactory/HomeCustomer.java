package andrey.patterns.creational.abstractfactory;

import andrey.patterns.creational.abstractfactory.homeorder.TeamHomeOrderFactory;

public class HomeCustomer {
    public static void main(String[] args) {
        TeamFactory teamFactory = new TeamHomeOrderFactory();

        DeliveryMan deliveryMan = teamFactory.getDeliveryMan();
        Operator operator = teamFactory.getOperator();
        Accountant accountant = teamFactory.getAccountant();

        operator.answerCalls();
        accountant.countOrders();
        deliveryMan.deliverCargo();


    }
}
