package andrey.patterns.structural.proxy;

public class RunnerDemo {
    public static void main(String[] args) {
        Info info = new ProxyCustomer("Andrey", 32);
        info.getInfo();
    }
}
