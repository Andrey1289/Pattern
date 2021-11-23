package andrey.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Airport implements Mediator{
    AirCraft airCraft;
    List<AirCraft> airCraftList= new ArrayList<>();

      public void waiting(AirCraft Craft){
         this.airCraftList.add(Craft);
      }

    @Override
    public void  notify(String message,AirCraft Craft) {
        for(AirCraft air : airCraftList){
            if(air!= Craft ){
           air.getMessage(message +" )Waiting permit ");
            }

        }
          airCraft.getMessage(message+ " )Waiting permit");
    }
    public void SetPriorityCraft(AirCraft priorityPlane){
      this.airCraft = priorityPlane;
    }
}
