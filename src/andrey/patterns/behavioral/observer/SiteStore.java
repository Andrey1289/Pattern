package andrey.patterns.behavioral.observer;

public class SiteStore {
    public static void main(String[] args) {
      SportStore sportStore = new SportStore();
        sportStore.addSportItem("Horizontal bar");
        sportStore.addSportItem("Protein");

      Observer subscriber1  =new Subscriber("Peta");
      Observer subscriber2  =new Subscriber("Anna");

      sportStore.addObserver(subscriber1);
      sportStore.addObserver(subscriber2);

      sportStore.addSportItem("Creatine");

      sportStore.removeSportItem("Protein");

    }
}
