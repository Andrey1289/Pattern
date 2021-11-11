package andrey.patterns.creational.prototype;

public class FactoryRectangle {
    Rectangle rectangle;

    public FactoryRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }


    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    Rectangle cloneRectangle(){
        return (Rectangle) rectangle.clone();
    }
}
