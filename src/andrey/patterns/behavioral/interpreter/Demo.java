package andrey.patterns.behavioral.interpreter;

public class Demo {
    public static void main(String[] args) {
    Expression goodWord = new TerminalExpression("good ");
    Expression badWord  = new TerminalExpression("dirty");
        System.out.println(goodWord.interpret("one good boy"));
        System.out.println(badWord.interpret("one dirty boy"));

    }
}
