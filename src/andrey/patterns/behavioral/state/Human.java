package andrey.patterns.behavioral.state;

public class Human {
    Activity activity;


    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof  BrushTeeth){
            setActivity(new MorningExercises());
        }else if(activity instanceof MorningExercises) {
            setActivity(new Work());
        }else if(activity instanceof Work){
            setActivity(new Sleep());
        }else if( activity instanceof Sleep){
            setActivity(new BrushTeeth());
        }
    }
    public void justDoIt(){
        activity.action();
    }
}
