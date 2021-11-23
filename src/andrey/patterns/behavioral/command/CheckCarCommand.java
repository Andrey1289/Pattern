package andrey.patterns.behavioral.command;

public class CheckCarCommand implements Command{
   STO sto;

    public CheckCarCommand(STO sto) {
        this.sto = sto;
    }

    @Override
    public void execute() {
        sto.checkCar();
    }
}
