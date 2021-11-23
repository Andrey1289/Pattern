package andrey.patterns.behavioral.visitor;

public class NifNif implements BuilderPig {
    @Override
    public void build(Brick brick) {
        System.out.println("NifNif was a lazy pig - he Dont use Brick");
    }

    @Override
    public void build(Wood wood) {
        System.out.println("NifNif was a lazy pig - he Dont use Wood");
    }

    @Override
    public void build(Straw straw) {
        System.out.println("NifNif was a lazy pig - he use Straw");

    }
}
