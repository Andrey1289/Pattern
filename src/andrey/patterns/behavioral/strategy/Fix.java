package andrey.patterns.behavioral.strategy;

public class Fix implements Sto{
    @Override
    public void doWork() {
        System.out.println("Car  was fix...");
    }
}
