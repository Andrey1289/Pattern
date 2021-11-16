package andrey.patterns.structural.decorator;

public interface DataSource {
    public void writeData(String data);

    String readData();
}
