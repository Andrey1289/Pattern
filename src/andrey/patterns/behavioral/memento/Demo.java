package andrey.patterns.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
    Computer computer = new Computer();
    Customer customer = new Customer();

    customer.addCustomer("Petr");
    customer.addCustomer("Kola");
        System.out.println(customer);

        computer.setSaveCheck(customer.saveCheck());
       customer.addCustomer("Ana");
        System.out.println(customer);
        customer.load(computer.getSaveCheck());
        System.out.println(customer);

    }
}
