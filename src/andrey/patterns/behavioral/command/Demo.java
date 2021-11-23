package andrey.patterns.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        STO sto = new STO();

        OwnerCar ownerCar = new OwnerCar(
                new SingUpCommand(sto),
                new CheckCarCommand(sto),
                new ReplaceCommand(sto)
                );
        ownerCar.serviceTheCar();
    }
}
