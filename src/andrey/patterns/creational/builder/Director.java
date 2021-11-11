package andrey.patterns.creational.builder;

public class Director {
    HomeBuilder homeBuilder;


    public void setHomeBuilder(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    Home buildHome(){
        homeBuilder.createHome();
        homeBuilder.buildName();
        homeBuilder.buildType();
        homeBuilder.buildPrice();
        Home home = homeBuilder.getHome();
        return home;
    }
}
