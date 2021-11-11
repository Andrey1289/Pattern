package andrey.patterns.creational.abstractfactory.homeorder;

import andrey.patterns.creational.abstractfactory.Operator;

public class OperatorForHomeOrder implements Operator {
    @Override
    public void answerCalls() {
        System.out.println("answers calls from home phone... ");
    }
}
