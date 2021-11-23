package andrey.patterns.behavioral.visitor;

public class Wood implements BuildingElements{
    @Override
    public void built(BuilderPig builderPig) {
        builderPig.build(this);
    }
}
