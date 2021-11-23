package andrey.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaveCheck {
    private String name;
    private Date date;
   // private List<SaveCheck> names = new ArrayList<>();

    public SaveCheck(String name) {
        this.name = name;
        this.date = new Date();
        //names.add(new SaveCheck(name));
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
