package andrey.patterns.behavioral.interpreter;

public class SearchGoodWord implements Expression{
    Expression expression;

    public SearchGoodWord(Expression expression) {
        this.expression = expression;
    }


    @Override
    public boolean interpret(String message) {
        return expression.interpret(message);
    }
}
