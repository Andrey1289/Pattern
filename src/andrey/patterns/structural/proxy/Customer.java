package andrey.patterns.structural.proxy;

public class Customer  implements Info{
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println(name+ " -" + age +" year");
    }
}
