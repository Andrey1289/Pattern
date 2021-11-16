package andrey.patterns.structural.proxy;

public class ProxyCustomer implements Info{
    private String name;
    private int age;
    private Customer customer;

    public ProxyCustomer(String name, int age ) {
        this.name = name;
        this.age = age;


    }

    @Override
    public void getInfo() {
        if(customer == null){
            customer = new Customer(name,age);
        }
        customer.getInfo();
    }
}
