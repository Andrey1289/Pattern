package andrey.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SportStore implements Observed {
    List<String> sportItem = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

   public void addSportItem(String item){
       this.sportItem.add(item);
       notifyObservers();
   }
    public void removeSportItem(String item){
        this.sportItem.remove(item);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
       subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
      subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       for(Observer o :subscribers){
           o.handleEvent(this.sportItem);
       }
      }
}
