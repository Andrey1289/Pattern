package andrey.patterns.behavioral.state;

public class Sleep implements Activity{
    @Override
    public void action() {
        System.out.println("go sleep...");
    }
}
