package andrey.patterns.creational.builder;

public class BrickHomeBuilder extends HomeBuilder {
    @Override
    void buildName() {
        home.setName("Brick house.");
    }

    @Override
    void buildType() {
      home.setTypeHome(TypeHome.BRICK);
    }

    @Override
    void buildPrice() {
        home.setPrice(200000);
    }
}
