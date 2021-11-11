package andrey.patterns.creational.prototype;

public class DemoPrototype {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);

        FactoryRectangle factoryRectangle = new FactoryRectangle(rectangle);

        Rectangle rectangle2 = factoryRectangle.cloneRectangle();
        System.out.println(rectangle2);




    }
}
