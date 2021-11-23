package andrey.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Computer {
   SaveCheck saveCheck;
    private List<SaveCheck> names = new ArrayList<>();

    public SaveCheck getSaveCheck() {
             return saveCheck;
    }

    public void setSaveCheck(SaveCheck saveCheck) {
         this.saveCheck = saveCheck;
    }
}
