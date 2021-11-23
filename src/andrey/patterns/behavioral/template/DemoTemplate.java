package andrey.patterns.behavioral.template;

public class DemoTemplate {
    public static void main(String[] args) {
        Network facebook = new Facebook();
        Network twitter = new Twitter();

        facebook.post();
        System.out.println("=========================================");
        twitter.post();

    }
}
