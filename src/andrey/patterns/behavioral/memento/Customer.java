package andrey.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private Date date;


    public void addCustomer(String name) {
        this.name = name;
        this.date = new Date();

    }
   public SaveCheck saveCheck(){
      return new SaveCheck(name);
   }
     public void load(SaveCheck saveCheck){
        name = saveCheck.getName();
        date = saveCheck.getDate();
     }
    @Override
    public String toString() {
        return "Customer:\n" +
                "\nName:" + name +
                "\nDate:" + date + "\n";

    }
}
