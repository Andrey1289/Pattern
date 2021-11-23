package andrey.patterns.behavioral.strategy;

public class Car {
    private String Name;
    Sto sto;

    public Car(String name) {
        Name = name;
    }

    public void setSto(Sto sto){
        this.sto= sto;
    }
  public void beCheck(){
        sto.doWork();
  }

}

