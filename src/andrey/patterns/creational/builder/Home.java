package andrey.patterns.creational.builder;

public class Home {
    private String name;
    private TypeHome typeHome;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeHome(TypeHome typeHome) {
        this.typeHome = typeHome;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", typeHome=" + typeHome +
                ", price=" + price +
                '}';
    }
}
