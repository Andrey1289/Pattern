package andrey.patterns.behavioral.strategy;

import java.util.Date;

public class NextTo implements Sto{
    @Override
    public void doWork() {
        System.out.println("Nest TO across .. 30 days..." );
    }
}
