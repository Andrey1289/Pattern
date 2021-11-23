package andrey.patterns.behavioral.command;

public class SingUpCommand implements Command{
    STO sto;

    public SingUpCommand(STO sto) {
        this.sto = sto;
    }

    @Override
    public void execute() {
        sto.singUpForService();
    }
}
