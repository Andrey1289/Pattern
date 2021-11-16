package andrey.patterns.structural.facade;

public class BicycleDeliveryMan implements DeliveryMan {
    private int wheelPressure = 1;
    boolean checkBike = false;
    boolean isActive = false;

    @Override
    public String toString() {
        return "BicycleDeliveryMan{" +
                "wheelPressure=" + wheelPressure +
                ", checkBike=" + checkBike +
                ", isActive=" + isActive +
                '}';
    }

    public boolean biCheck() {
        return checkBike = true;
    }
    public boolean activeStart(){
        return isActive = true;
    }

    public void deliverCargo() {
        System.out.println("delivery by bike....");
    }

    public int getWheelPressure() {
        return wheelPressure;
    }

    public void setWheelPressure(int wheelPressure) {
        this.wheelPressure = wheelPressure;
    }
}
