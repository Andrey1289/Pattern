package andrey.patterns.behavioral.strategy;

public class DemoStrategy {
    public static void main(String[] args) {

        Car car = new Car("Niva");

        car.setSto(new Wash());
        car.beCheck();

        car.setSto(new Checking());
        car.beCheck();

        car.setSto(new Fix());
        car.beCheck();

        car.setSto(new NextTo());
        car.beCheck();




    }
}
