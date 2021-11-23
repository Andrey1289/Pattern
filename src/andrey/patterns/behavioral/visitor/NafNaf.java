package andrey.patterns.behavioral.visitor;

public class NafNaf implements BuilderPig{
    @Override
    public void build(Brick brick) {
        System.out.println("NafNaf was a lazy pig - he Dont use Brick");
    }

    @Override
    public void build(Wood wood) {
        System.out.println("NafNaf was a lazy pig - he use Wood");

    }

    @Override
    public void build(Straw straw) {
        System.out.println("NafNaf was a lazy pig - but he dont use Straw");
    }
}
