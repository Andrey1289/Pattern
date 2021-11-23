package andrey.patterns.behavioral.mediator;

public class Airplane implements AirCraft {
  Mediator mediator;
   String name;

  public Airplane(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  @Override
    public void sendMessage(String message) {
    System.out.println(" i am " + this.name + " send " + message);
      mediator.notify(message,this);

    }

    @Override
    public void getMessage(String message) {
      System.out.println(this.name + " receiving --(" + message);
    }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
