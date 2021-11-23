package andrey.patterns.behavioral.visitor;

public class BuildHome implements BuildingElements{
    BuildingElements [] buildingElements;

    public BuildHome() {
        this.buildingElements = new  BuildingElements[]{
          new Brick(),
          new Wood(),
          new Straw()
        };
    }


    @Override
    public void built(BuilderPig builderPig) {
        for(BuildingElements be : buildingElements){
            be.built(builderPig);
        }
    }
}
