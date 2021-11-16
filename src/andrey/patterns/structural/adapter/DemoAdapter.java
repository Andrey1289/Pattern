package andrey.patterns.structural.adapter;

public class DemoAdapter {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(6);
        if(roundHole.checkFits(roundPeg)){
            System.out.println("Входит и вы ходит, замечательно вы ходит)))");
        }
        SquarePeg smallSquare = new SquarePeg(5);
        SquarePeg bigSquare = new SquarePeg(15);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquare);
        SquarePegAdapter bigPegAdapter = new SquarePegAdapter(bigSquare);

        if(roundHole.checkFits(smallAdapter)){
            System.out.println("Входит и вы ходит, замечательно вы ходит)))");
        }
        if(!roundHole.checkFits(bigPegAdapter)){
            System.out.println("Не проходит...");
        }
    }
}
