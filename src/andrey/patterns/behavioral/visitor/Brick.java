package andrey.patterns.behavioral.visitor;

public class Brick implements BuildingElements{
    @Override
    public void built(BuilderPig builderPig) {
        builderPig.build(this);
    }
}
