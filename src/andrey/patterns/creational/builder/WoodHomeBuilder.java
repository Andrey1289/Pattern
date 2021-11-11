package andrey.patterns.creational.builder;

public class WoodHomeBuilder extends HomeBuilder {

    @Override
    void buildName() {
        home.setName("Wood house.");
    }

    @Override
    void buildType() {
     home.setTypeHome(TypeHome.WOOD);

    }

    @Override
    void buildPrice() {
      home.setPrice(100000);
    }
}
