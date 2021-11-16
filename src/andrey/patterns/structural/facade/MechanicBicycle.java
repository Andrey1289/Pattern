package andrey.patterns.structural.facade;

public class MechanicBicycle {
    public void checkTransport(BicycleDeliveryMan bicycleDeliveryMan){
        if( bicycleDeliveryMan.checkBike == false){
            System.out.println("Bike unCheck..");
            System.out.println("================");
           if(bicycleDeliveryMan.getWheelPressure() < 2)
               System.out.println("Pressure before work mechanic- " + bicycleDeliveryMan.getWheelPressure());
               bicycleDeliveryMan.setWheelPressure(2);
            System.out.println("Pressure after work mechanic- " + bicycleDeliveryMan.getWheelPressure());
           bicycleDeliveryMan.biCheck();
            System.out.println("With bike every Okey...");
        }
   }
}
