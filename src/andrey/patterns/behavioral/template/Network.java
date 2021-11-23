package andrey.patterns.behavioral.template;

public abstract class Network {
    public void post(){
        System.out.println("Your post on the ");
        wherePost();

    }
    abstract void wherePost();
}
