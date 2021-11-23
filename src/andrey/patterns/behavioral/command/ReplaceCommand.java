package andrey.patterns.behavioral.command;

public class ReplaceCommand implements Command{
    STO sto;

    public ReplaceCommand(STO sto) {
        this.sto = sto;
    }

    @Override
    public void execute() {
       sto.replaceWheels();
    }
}
