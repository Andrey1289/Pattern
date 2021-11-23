package andrey.patterns.behavioral.state;

public class HumanDay {
    public static void main(String[] args) {
        Activity activity = new BrushTeeth();
        Human human = new Human();

        human.setActivity(activity);

        for (int i = 0; i <10 ; i++) {
             human.justDoIt();
             human.changeActivity();

        }
    }
}
