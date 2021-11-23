package andrey.patterns.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        String[] achievements = {"First place ","First place ","Second place" };
        Sportsman sportsman = new Sportsman("Petr" , achievements);

        Iterator iterator = sportsman.getIterator();
        System.out.println("Sportsman: " + sportsman.getName());
        System.out.println("achievements: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");

        }
    }
}
