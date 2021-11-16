package andrey.patterns.structural.facade;

public class Operator {

    public void sendDeliveryMan(BicycleDeliveryMan bicycleDeliveryMan){
        if(bicycleDeliveryMan.isActive == false){
            System.out.println("DeliveryMan is not busy.." + bicycleDeliveryMan.isActive);
            bicycleDeliveryMan.activeStart();
            System.out.println("Send BicycleDeliveryMan.." + bicycleDeliveryMan.isActive);


        }
    }

}
