package andrey.patterns.creational.abstractfactory;

public interface TeamFactory {
    Accountant getAccountant();
    Operator getOperator();
    DeliveryMan getDeliveryMan();
}
