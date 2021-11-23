package andrey.patterns.behavioral.mediator;

public class DemoFlying {
    public static void main(String[] args) {
      Airport airport = new Airport();

      AirCraft plane = new Helicopter(airport,"helicopter");
      AirCraft plane2 = new Airplane(airport, "boeing2");
      AirCraft plane3 = new Airplane(airport, "boeing3");

         airport.SetPriorityCraft(plane);
         airport.waiting(plane2);
         airport.waiting(plane3);
        plane2.sendMessage("ready to land");
         plane.sendMessage("ready to land");




    }
}
