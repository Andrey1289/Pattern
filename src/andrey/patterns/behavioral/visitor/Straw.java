package andrey.patterns.behavioral.visitor;

public class Straw implements BuildingElements{
    @Override
    public void built(BuilderPig builderPig) {
        builderPig.build(this);
    }
}
