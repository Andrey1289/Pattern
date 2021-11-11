package andrey.patterns.creational.abstractfactory.corporateorder;

import andrey.patterns.creational.abstractfactory.Operator;

public class OperatorForCorporateOrder implements Operator {
    @Override
    public void answerCalls() {
        System.out.println("answers calls from corporation phone...");
    }
}
