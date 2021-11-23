package andrey.patterns.behavioral.visitor;

public class NufNuf implements BuilderPig{
    @Override
    public void build(Brick brick) {
        System.out.println("NufNuf was a smart pig - he use Brick");
    }

    @Override
    public void build(Wood wood) {
        System.out.println("NufNuf use wood only build door");
    }

    @Override
    public void build(Straw straw) {
        System.out.println("NufNuf use straw only build bed");
    }
}
