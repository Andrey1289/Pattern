package andrey.patterns.behavioral.command;

public class OwnerCar {
    Command singUP;
    Command checkCar;
    Command replaceWheels;


    public OwnerCar(Command singUP, Command checkCar, Command replaceWheels) {
        this.singUP = singUP;
        this.checkCar = checkCar;
        this.replaceWheels = replaceWheels;
    }

     public void serviceTheCar(){
        singUP.execute();
        checkCar.execute();
        replaceWheels.execute();
     }
}
