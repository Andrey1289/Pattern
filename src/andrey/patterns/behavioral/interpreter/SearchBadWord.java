package andrey.patterns.behavioral.interpreter;

public class SearchBadWord implements Expression{
    Expression expression;

    public SearchBadWord(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(String message) {
        return   expression.interpret(message);
    }
}
