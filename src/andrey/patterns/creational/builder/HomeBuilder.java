package andrey.patterns.creational.builder;

public abstract class HomeBuilder {
 Home home;

 void createHome(){
     home = new Home();
 }
 abstract void buildName();
 abstract void buildType();
 abstract void buildPrice();

 Home getHome(){
     return home;
 }


    
}
