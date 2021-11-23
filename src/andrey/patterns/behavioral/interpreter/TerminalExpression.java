package andrey.patterns.behavioral.interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String message) {
        if(message.contains(data)){
            return true;}
        return false;
    }
}
