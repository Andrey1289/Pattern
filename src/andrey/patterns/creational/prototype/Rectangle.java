package andrey.patterns.creational.prototype;

public class Rectangle implements Copyable{
      private int weight;
      private int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Object clone() {
         Rectangle rect = new Rectangle(weight,height);

        return rect;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
