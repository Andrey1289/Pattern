package andrey.patterns.structural.facade;

public class Facade {
    BicycleDeliveryMan bikeMan = new BicycleDeliveryMan();
    Operator operator = new Operator();
    MechanicBicycle mechanicBicycle = new MechanicBicycle();

    public void startWork(){
        mechanicBicycle.checkTransport(bikeMan);
        operator.sendDeliveryMan(bikeMan);
        System.out.println(bikeMan);
    }
}
