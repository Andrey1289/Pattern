package andrey.patterns.creational.builder;

public class DemoBuilding {
    public static void main(String[] args) {
        Director director = new Director();
        director.setHomeBuilder(new WoodHomeBuilder());
          Home home = director.buildHome();
        System.out.println(home);


    }
}
