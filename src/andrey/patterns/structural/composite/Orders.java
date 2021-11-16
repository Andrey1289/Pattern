package andrey.patterns.structural.composite;

public class Orders {
    public static void main(String[] args) {
         TeamDeliveryMan teamDeliveryMan = new TeamDeliveryMan();

         BicycleDeliveryMan bicycleDeliveryMan = new BicycleDeliveryMan();
         MotoDeliveryMan motoDeliveryMan1 = new MotoDeliveryMan();
         MotoDeliveryMan motoDeliveryMan2 = new MotoDeliveryMan();

         teamDeliveryMan.addDeliveryMan(bicycleDeliveryMan);
         teamDeliveryMan.addDeliveryMan(motoDeliveryMan1);
         teamDeliveryMan.addDeliveryMan(motoDeliveryMan2);
         teamDeliveryMan.createDelivery();
    }
}
