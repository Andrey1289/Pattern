package andrey.patterns.structural.decorator;

public class DemoDecorator {
    public static void main(String[] args) {
        String dataPerson = "Name and age\nAndrey Galkovskii,32\nHobi and favorite film\nSport ,Harry Potter ";
        DataSourceDecorator encoded = new EncryptionDecorator(
                                          new FileDataSource("C:/Users/dobpu/OneDrive/Рабочий стол/TextRead.txt"));
        encoded.writeData(dataPerson);
        DataSource plain =new FileDataSource("C:/Users/dobpu/OneDrive/Рабочий стол/TextRead.txt");

        System.out.println("-Input=============");
        System.out.println(dataPerson);
       System.out.println("-Encoded=============");
        System.out.println(plain.readData());
        System.out.println("-Decoded============");
        System.out.println(encoded.readData());
        plain.writeData(encoded.readData());


    }
}
