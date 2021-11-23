package andrey.patterns.behavioral.iterator;

import java.util.List;

public class Sportsman implements Collection {
     private String name;
     private String[] achievements;

    public Sportsman(String name, String[] achievements) {
        this.name = name;
        this.achievements = achievements;
    }


    @Override
    public Iterator getIterator() {
        return new achievementsIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAchievements() {
        return achievements;
    }

    public void setAchievements(String [] achievements) {
        this.achievements = achievements;
    }
    private class achievementsIterator implements Iterator{
      int index;
        @Override
        public boolean hasNext() {
         if(index < achievements.length){
             return true;
         }
         return false;
        }

        @Override
        public Object next() {
            return achievements[index++];
        }
    }
}
